package com.springbootjwt.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		//encrypt the password by the below url
		//https://www.javainuse.com/onlineBcrypt
		if("gopi".equalsIgnoreCase(username))
			return new User("gopi","$2a$10$Cz9.gkTu/LvCymPenc79re9.cXzd1qwXJGRsRmVBBKiXIXxpDKUiS",new ArrayList());
		else
			System.out.println("exception :"+ExceptionEnumApp.JwtException1);
			throw new UsernameNotFoundException("User not found exception");
	}

}
