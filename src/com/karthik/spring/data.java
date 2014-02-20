package com.karthik.spring;

import javax.jdo.PersistenceManager;
import javax.jdo.annotations.PersistenceCapable;

import com.google.appengine.api.blobstore.BlobKey;

@PersistenceCapable
public class data {
	PersistenceManager pm=PMF.get();
	RegisterJdo emp=new RegisterJdo();

	void reg(String firstname,String lastname,String username,String password,String mobile,String location,String email,String date )
	{
		  emp.setFirstname(firstname);
	      emp.setLastname(lastname);
	      emp.setUsername(username);
	      emp.setPassword(password);
	      emp.setMobile(mobile);
	      emp.setLocation(location);
	      emp.setMailid(email);
	      emp.setDate(date);
	   
	      pm.makePersistent(emp);
	pm.close();
}
}
