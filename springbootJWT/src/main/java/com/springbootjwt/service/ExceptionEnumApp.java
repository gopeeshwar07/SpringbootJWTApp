package com.springbootjwt.service;

public enum ExceptionEnumApp {
	JwtException1("101", "jwt exception");
	String eid, msg;

	ExceptionEnumApp(String eid, String msg) {
		this.eid = eid;
		this.msg = msg;
	}

}
