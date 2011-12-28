package com.tetrasi.session;

import javax.ejb.Stateless;
@Stateless
public  class MyEjb implements MyEjbRemote {

	public MyEjb() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String afficheHello() {
		
		return "Hello World";
	}

}
