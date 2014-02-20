package com.karthik.spring;
import javax.jdo.JDOHelper;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.blobstore.BlobKey;

import java.lang.Object;

@PersistenceCapable
public class RegisterJdo {

	 @PrimaryKey
	 private String mailid;
	    private String firstname;
	    private String lastname;
		 private String username;
		 private String password;
		 private String mobile;
		 private String location;
		 private String date;
		
		 
		
		public String getFirstname() {
				return firstname;
			}

			public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

			public void setFirstname(String firstname) {
				this.firstname = firstname;
			}

			public String getLastname() {
				return lastname;
			}

			public void setLastname(String lastname) {
				this.lastname = lastname;
			}

			public String getUsername() {
				return username;
			}

			public void setUsername(String username) {
				this.username = username;
			}

			public String getPassword() {
				return password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public String getMobile() {
				return mobile;
			}

			public void setMobile(String mobile) {
				this.mobile = mobile;
			}

			public String getLocation() {
				return location;
			}

			public void setLocation(String location) {
				this.location = location;
			}

			public String getMailid() {
				return mailid;
			}

			public void setMailid(String mailid) {
				this.mailid = mailid;
			}
	
	
}
