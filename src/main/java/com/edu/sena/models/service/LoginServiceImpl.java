package com.edu.sena.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.sena.models.entity.Login;
import com.edu.sena.repository.LoginRepository;
import com.edu.sena.repository.UsuarioRepository;

@Service

public class LoginServiceImpl implements LoginService{
	
	@Autowired LoginRepository loginRepository;
	

	@Override
	public Login save(Login l) {
		// TODO Auto-generated method stub
		return loginRepository.save(l);
	}

	@Override
	public String logi(String user, String ctr) {
		
		Login login = loginRepository.findByUsername(user);
		
		if (login == null) {
			return "Usuario no encontrado";
			
		}
		
		if (!login.getPassword().equals(ctr)) {
			return "Contraseña Incorrecta";
		}
		
		return "Inicio de sesion exitoso";
	}
	
	
	
	

}
