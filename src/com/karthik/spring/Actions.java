package com.karthik.spring;

import javax.jdo.PersistenceManager;

import com.google.appengine.api.blobstore.BlobKey;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.Text;
public class Actions {
	PersistenceManager pm=PMF.get();
	ScreenshotJdo emp=new ScreenshotJdo();

	void reg(String timezone,String date,String hostaddress,String email,String hostname,String operatingsystem,String imgtxt,BlobKey blobkey)
	{
		
		Text t = new Text(imgtxt);
		  emp.setTimezone(timezone);
	      emp.setDate(date);
	      emp.setHostaddress(hostaddress);
	      emp.setEmail(email);
	      emp.setHostname(hostname);
	      emp.setOperatingsystem(operatingsystem);
	      emp.setImgtxt(t);
	      emp.setBlobkey(blobkey);
	      System.out.println(timezone+email+hostaddress+hostname+operatingsystem+imgtxt+blobkey);
	      pm.makePersistent(emp);
	pm.close();
}	
}