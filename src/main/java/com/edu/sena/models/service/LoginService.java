package com.edu.sena.models.service;

import com.edu.sena.models.entity.Login;

public interface LoginService {
	
	
	public Login save(Login l);
	public String logi(String user, String ctr);
	

}
