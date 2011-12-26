package com.tetrasi.session;

import javax.ejb.Stateless;
@Stateless
public  class MonEjb implements MonEjbRemote {

	public MonEjb() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String afficheHello() {
		
		return "Hello World";
	}

}
