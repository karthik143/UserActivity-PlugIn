package com.karthik.spring;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.blobstore.BlobKey;
import com.google.appengine.api.datastore.Text;
@PersistenceCapable
public class ScreenshotJdo {
	
	 @Persistent
    private String timezone;
	 
	 @Persistent
    private String date;

	 @Persistent
	 private String hostaddress;
	 
	 @Persistent
	 private String email;
    
	 @Persistent
	 private String hostname;

	 @Persistent
	 private String operatingsystem;
	

	 @Persistent
	 private Text imgtxt;
	 
	 @Persistent
     private BlobKey blobkey;
	 
	
	
	
	 public BlobKey getBlobkey() {
		return blobkey;
	}

	public void setBlobkey(BlobKey blobkey) {
		this.blobkey = blobkey;
	}

	public Text getImgtxt() {
			return imgtxt;
		}

		public void setImgtxt(Text imgtxt) {
			this.imgtxt = imgtxt;
		}
	

	public String getOperatingsystem() {
		return operatingsystem;
	}

	public void setOperatingsystem(String operatingsystem) {
		this.operatingsystem = operatingsystem;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getEmail() {
		return email;
	}

	public String getHostaddress() {
		return hostaddress;
	}

	public void setHostaddress(String hostaddress) {
		this.hostaddress = hostaddress;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}	
     
}