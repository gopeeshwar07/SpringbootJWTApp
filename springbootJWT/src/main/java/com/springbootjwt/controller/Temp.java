package com.springbootjwt.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Object> claims=new HashMap();
		String subject="gopi";
		String tokenGenereated=Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 10 * 1000))
				.signWith(SignatureAlgorithm.HS512, "gopi2").compact();
		
		System.out.println("token:"+tokenGenereated+"\n");
		System.out.println(Jwts.parser().setSigningKey("kJiWtXOb-WonS-a2EPtkV3YKYDAPZsunryBTDR16sLXlnNeUiiIijD3gNrrDTtZF89oEUzyZllGHpuRvPP_EXA").parseClaimsJws(tokenGenereated));

	}

}
