package com.sito.security.service;

import com.sito.security.payload.LoginDto;
import com.sito.security.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}
