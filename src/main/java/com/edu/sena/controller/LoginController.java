package com.edu.sena.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.sena.models.entity.Login;
import com.edu.sena.models.service.LoginService;

@RestController
@RequestMapping("/api/logins")

public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@PostMapping
	public Login guardar(@RequestBody Login l) {
		return loginService.save(l);
		
	}
	
	
	@PostMapping("/log")
	public ResponseEntity<String> log(@RequestBody Login login) {
		String mensaje = loginService.logi(login.getUsername(), login.getPassword());
		return ResponseEntity.ok(mensaje);
		
	}
	
	
	

}
