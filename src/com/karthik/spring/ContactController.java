package com.karthik.spring;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.geronimo.mail.util.Base64;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.google.appengine.api.blobstore.BlobKey;
import com.google.appengine.api.blobstore.BlobstoreService;
import com.google.appengine.api.blobstore.BlobstoreServiceFactory;
import com.google.appengine.api.files.AppEngineFile;
import com.google.appengine.api.files.FileReadChannel;
import com.google.appengine.api.files.FileService;
import com.google.appengine.api.files.FileServiceFactory;
import com.google.appengine.api.files.FileWriteChannel;
import com.google.appengine.labs.repackaged.org.json.JSONTokener;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



 
@Controller
@SessionAttributes
public class ContactController {
 

	@RequestMapping(value = "/sendEmail", method = RequestMethod.GET)
	public String getAddCustomerPage14(ModelMap model) {
 
		return "sendEmail";
 
	}
	
	@RequestMapping(value = "/addLogin", method = RequestMethod.GET)
	public String getAddCustomerPage2(ModelMap model) {
 
		return "addLogin";
 
	}
	

	@RequestMapping(value = "/addEmail", method = RequestMethod.GET)
	public String getAddCustomerPage13(ModelMap model) {
 
		return "addEmail";
 
	}
	
	
	
	
	@RequestMapping(value = "/addContact", method = RequestMethod.GET)
	public String getAddCustomerPage(ModelMap model) {
 
		return "addContact";
 
	}
	
	
	
	@RequestMapping(value = "/local", method = RequestMethod.GET)
	public String getAddCustomerPage15(ModelMap model) {
 
		return "local";
 
	}
	
	
	@RequestMapping(value = "/addRegister", method = RequestMethod.GET)
	public String getAddCustomerPage1(ModelMap model) {
 
		return "addRegister";
 
	}
	
 
	
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	 public String getAddCustomerPage12(ModelMap model) {
	 
	  return "add";
	 
	 }
	
	
	
	@RequestMapping(value = "/addEmail", method = RequestMethod.POST)
		 public ModelAndView addEmail(HttpServletRequest request,HttpServletResponse response, ModelMap model) throws ServletException, IOException 
		 {
			  
			  data ac=new data();
			   // ...
			           Properties props = new Properties();
			           Session session = Session.getDefaultInstance(props, null);

			           String msgBody = null;
		
					String firstname = request.getParameter("first");
			        String lastname = request.getParameter("last");
                    String username = request.getParameter("user");
                     String password = request.getParameter("pass");
                     String mobile = request.getParameter("mobile");
			           String location = request.getParameter("location");
			           String email = request.getParameter("email");
			           String date = request.getParameter("date");
			       	
			           
			        
			           try {
			        	   
			        	   msgBody="FirstName:"+firstname+"\n" +"LastName:"+lastname+"\n"+"UserName:"+username+"\n" +"Password:"+password+"\n " +"Mobile:"+mobile+"\n " +"Location:"+location+"\n "+"EmailID:"+email+"\n "+"Date:"+date;
			               Message msg = new MimeMessage(session);
			               msg.setFrom(new InternetAddress("karthikinmiracle@gmail.com", "Example.com Admin"));
			               msg.addRecipient(Message.RecipientType.TO,
			                                new InternetAddress("karthikroshanmca@gmail.com", "Mr. User"));
			               
			               
			               msg.addRecipient(Message.RecipientType.TO,
	                                new InternetAddress(email));
			               msg.setSubject("New UserAccount has been registred");
			               msg.setText(msgBody);
			             
			               Transport.send(msg);
			               ac.reg(firstname,lastname,username,password,mobile,location,email,date);  
			           	System.out.println("Success");

			           } catch (AddressException e) {
			               // ...
			           } catch (MessagingException e) {
			               // ...
			           }
			          
			           return new ModelAndView("contact");
		
			      
		 }
		
	
/*	@RequestMapping(value = "/sendEmail", method = RequestMethod.POST)
	 public void sendEmail(@RequestBody String data,HttpServletRequest request,HttpServletResponse response, ModelMap model) throws ServletException, IOException, ParseException 
	 {
		   // ...
		           Properties props = new Properties();
		           Session session = Session.getDefaultInstance(props, null);

		           String msgBody = null;
		           String timezone = null;
			   	    String date=null;
			   	    String hostaddress=null;
			   	    String email = null;
			   	    String hostname=null;
			   	    String operatingsystem=null;
			   	    String blobkey=null;
			   	   
		           JSONObject jsonobject = new JSONObject();
		           JSONParser jsonparser = new JSONParser();
		   	
		   	        HttpSession ses=request.getSession();
		   	        blobkey=ses.getAttribute("blobkey").toString();
		   	     
		   			jsonobject = (JSONObject) jsonparser.parse(data);
		   			timezone = (String) jsonobject.get("timezone"); 
		   			date=(String) jsonobject.get("date");
		   			hostaddress=(String) jsonobject.get("hostaddress");
		   			email = (String) jsonobject.get("email");
		   			hostname=(String) jsonobject.get("hostname");
		   			operatingsystem=(String) jsonobject.get("operatingsystem");
		   			
		   			
		   			HttpSession session1=request.getSession();
		   			session1.setAttribute("blobkey", blobkey);
		   			
		   			Date date1=new Date(Long.parseLong(date));
		   			System.out.println(timezone);
					System.out.println( date1);
					System.out.println(hostaddress);
					System.out.println(email);
					System.out.println(hostname);
					System.out.println(operatingsystem);
					System.out.println(blobkey);
									
		           try {
		        	   
		        	   msgBody="TimeZone:"+timezone+"\n" +"Date:"+date1+"\n"+"HostAddress:"+hostaddress+"\n" +"Email-ID:"+email +"\n "+"Host:"+hostname+"\n"+"OpearatingSystem:"+operatingsystem+"\n"+"blobkey:"+blobkey;
		               Message msg = new MimeMessage(session);
		               msg.setFrom(new InternetAddress("karthikinmiracle@gmail.com", "UserActivity Admin"));
		               msg.addRecipient(Message.RecipientType.TO,
		                                new InternetAddress("karthikroshanmca@gmail.com", "Mr. User"));
		               msg.setSubject("New User has been registred");
		               msg.setText(msgBody);
		             
		               Transport.send(msg);
		               
		           	System.out.println("Success");

		           } catch (AddressException e) {
		               // ...
		           } catch (MessagingException e) {
		               // ...
		           }
		          
		          // return new ModelAndView("contact");
	
		      
	 }
	*/


	
	@RequestMapping(value = "/sendEmail", method = RequestMethod.POST)
	 public void sendEmail(@RequestBody String data,HttpServletRequest request,HttpServletResponse response, ModelMap model) throws ServletException, IOException, ParseException 
	 {
		   // ...
		           Properties props = new Properties();
		           Session session = Session.getDefaultInstance(props, null);

		       try
		       {

		         
			   	    String email = null;
			   	   
			   	    String imgstr=null;
			   	   
			   	   
			   	  
			   	   JSONParser parser=new JSONParser();
		           JSONObject jsonobject=(JSONObject) parser.parse(data);
		   	
		   			imgstr = jsonobject.get("image").toString();
		   			email =jsonobject.get("email").toString();
		   		
		   		
		   			
		   			
		     	     			Message msg = new MimeMessage(session);
					msg.setFrom(new InternetAddress("karthikinmiracle@gmail.com",
							"Example.com Admin"));
					msg.addRecipient(Message.RecipientType.TO, new InternetAddress(
							email, "Mr. User"));
					msg.setSubject("User Screen has been Received");
					
					String data1=imgstr.substring(imgstr.indexOf(",")+1, imgstr.length());
					System.out.println(data1);
					byte[] imageDataBytes = Base64.decode(data1);

					Multipart mp = new MimeMultipart();
					

					MimeBodyPart htmlPart = new MimeBodyPart();
					
					
					htmlPart.setFileName("screen.png");
					DataSource source = new ByteArrayDataSource(imageDataBytes, "image/png");
					
				    htmlPart.setDataHandler(new DataHandler(source));
				    
				    
				    
					mp.addBodyPart(htmlPart);
                  
					msg.setContent(mp);
					Transport.send(msg);
					
					response.getWriter().println("Screen shot sended successfully");		
		   		
		           
		       }
		       catch (Exception e) {
					System.err.println(e);
				
				}
		          // return new ModelAndView("contact");
	
		      
	 }
	
	 
	 
	 @SuppressWarnings("unchecked")
	@RequestMapping(value = "/addLogin", method = RequestMethod.POST)
	 public String addLogin(HttpServletRequest request,HttpServletResponse response, ModelMap model) throws ServletException, IOException 
	 {
		   PersistenceManager pm=PMF.get();
		
		  
		  String txtname=request.getParameter("user");
		   String txtpassword=request.getParameter("pass");
		  

		     Query q= pm.newQuery(RegisterJdo.class);
		     q.setFilter("mailid==nameParameter && password==passwordParameter");
		     q.declareParameters("String nameParameter,String passwordParameter");
		      
		   //Customer c=new Customer();
		      try
		      {
		     
			List<RegisterJdo> results=(List<RegisterJdo>)q.execute(txtname,txtpassword);
		      System.out.println(results);
		      if(!results.isEmpty())
		      {
		    	  HttpSession ses=request.getSession();
		    	  ses.setAttribute("mailid", txtname);
		    		return "test";
		      }
		      return "contact";
		     	
		      }
		      finally
		      {
		    	  pm.close();
		    	  q.closeAll();
		      }
	 }
	 
	 
	 
	/*
	 @SuppressWarnings("unchecked")
		@RequestMapping(value = "/addService", method = RequestMethod.POST)
		 public void addService(@RequestBody String data,HttpServletRequest request,HttpServletResponse response, ModelMap model) throws ServletException, IOException, ParseException 
		 {
		 PrintWriter out=response.getWriter();
		 	PersistenceManager pm=PMF.get();
		 	
		 	JSONObject jsonobject = new JSONObject();
	          JSONParser jsonparser = new JSONParser();
			 
	           String time = (String) jsonobject.get("from");
	         
	           jsonobject = (JSONObject) jsonparser.parse(data);
		 ScreenshotJdo screen=pm.getObjectById(ScreenshotJdo.class,time);
		 
			if (screen.getDate().equals(time))
			{
				System.out.println("found");
			}
		 
		  JSONObject jsonobject = new JSONObject();
          JSONParser jsonparser = new JSONParser();
		 
           String time = (String) jsonobject.get("timezone");
         
      	
      	
     
        
		     Query q= pm.newQuery(ScreenshotJdo.class);
		     q.setFilter("date==timeParameter");
		     q.declareParameters("String timeParameter");
		      
		   //Customer c=new Customer();
		      try
		      {
		     
			List<ScreenshotJdo> results=(List<ScreenshotJdo>)q.execute(time);
		      System.out.println(results);
		      if(!results.isEmpty())
		      {
		          out.println("results");
		    		
		      }
		
		     	
		     
		    
		 }*/

	
	 
	 @RequestMapping(value = "/addServe", method = RequestMethod.GET)
		 public void addServe(HttpServletRequest request,HttpServletResponse response, ModelMap model) throws ServletException, IOException 
		 {
			
			  response.setContentType("text/html");
			  BlobstoreService blobstoreService = BlobstoreServiceFactory.getBlobstoreService();
			  BlobKey blobKey = new BlobKey(request.getParameter("blob-key"));
	          blobstoreService.serve(blobKey, response);
			 
			 
			  //out.println("<img src="+blobKey+">");
			  
			   
			   //http://localhost:8888/addServe.html?blob-key=2TVbkLE6l60wG18JlqAx0A
			  

			   //Customer c=new Customer();
			    
		 }

	
	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/addContact", method = RequestMethod.POST)
	public /*@ResponseBody String*/ void addContact(@RequestBody String data,HttpServletRequest request, ModelMap model,HttpServletResponse response) throws IOException, ServletException {
		Actions ac=new Actions();

		System.out.println("value: "+data);
	    JSONObject jsonobject = new JSONObject();
	    JSONParser jsonparser = new JSONParser();
	    String timezone = null;
	    String date=null;
	    String hostaddress=null;
	    String email = null;
	    String hostname=null;
	    String operatingsystem=null;
	    String imgstr = null;
	    BlobKey blobKey=null;
	   
	    
	    try {
			jsonobject = (JSONObject) jsonparser.parse(data);
			timezone = (String) jsonobject.get("timezone"); 
			date=(String) jsonobject.get("date");
			hostaddress=(String) jsonobject.get("hostaddress");
			email = (String) jsonobject.get("email");
			hostname=(String) jsonobject.get("hostname");
			operatingsystem=(String) jsonobject.get("operatingsystem");
			imgstr = (String) jsonobject.get("image");
			
			
			
			
			// Get a file service
			FileService fileService = FileServiceFactory.getFileService();

			// Create a new Blob file with mime-type "text/plain"
			AppEngineFile file = fileService.createNewBlobFile("text/plain");

			// Open a channel to write to it
			boolean lock = false;
			FileWriteChannel writeChannel = fileService.openWriteChannel(file, lock);

			// Different standard Java ways of writing to the channel
			// are possible. Here we use a PrintWriter:
			PrintWriter out = new PrintWriter(Channels.newWriter(writeChannel, "UTF8"));
			out.println(imgstr);
		

			// Close without finalizing and save the file path for writing later
			out.close();
		
			String path = file.getFullPath();

			// Write more to the file in a separate request:
			file = new AppEngineFile(path);

			// This time lock because we intend to finalize
			lock = true;
			writeChannel = fileService.openWriteChannel(file, lock);

			// This time we write to the channel directly
			writeChannel.write(ByteBuffer.wrap
			          (imgstr.getBytes()));

			// Now finalize
			writeChannel.closeFinally();

			// Later, read from the file using the Files API
			lock = false; // Let other people read at the same time
			FileReadChannel readChannel = fileService.openReadChannel(file, false);

			// Again, different standard Java ways of reading from the channel.
			BufferedReader reader =
			        new BufferedReader(Channels.newReader(readChannel, "UTF8"));
			     @SuppressWarnings("unused")
				String line = reader.readLine();
			// line = "The woods are lovely dark and deep."

			readChannel.close();
			BlobstoreService blobStoreService = BlobstoreServiceFactory.getBlobstoreService();
			// Now read from the file using the Blobstore API
			 blobKey = fileService.getBlobKey(file);
			//System.out.println(blobKey);
		/*	 request.setAttribute("blobkey", blobKey);
			 request.getRequestDispatcher("/test.jsp").forward(request, response);*/
			 System.out.println(blobKey.getKeyString());
		
			// response.sendRedirect("/addServe?blob-key=" + blobKey.getKeyString());

			
			  HttpSession session=request.getSession();  
		        session.setAttribute("blobkey",blobKey.toString()); 
			 
			@SuppressWarnings("unused")
			

			String segment = new String(blobStoreService.fetchData(blobKey, 30, 40));
			
			
			ac.reg(timezone,date,hostaddress,email,hostname,operatingsystem,imgstr,blobKey);
			/*request.setAttribute("jsonString", jsonobject);
			    RequestDispatcher dispatcher = request.getRequestDispatcher("/sendEmail");
			    dispatcher.include(request, response);*/
			
		} catch (ParseException e) {
			
			e.printStackTrace();
		}

   //   return blobKey.getKeyString();
	   
}
	
	
	
	
	 @RequestMapping("/contacts")
	    public ModelAndView showContacts() {
	         
	        return new ModelAndView("contact", "command", new ScreenshotJdo());
	    }
	 @RequestMapping("/test")
	    public ModelAndView test() {
	         
	        return new ModelAndView("test", "command", new ScreenshotJdo());
	    }
	 @RequestMapping("/home")
	    public ModelAndView home() {
	         
	        return new ModelAndView("home", "command", new ScreenshotJdo());
	    }
	 @RequestMapping("/first")
	    public ModelAndView map() {
	         
	        return new ModelAndView("first", "command", new ScreenshotJdo());
	    }
	 @RequestMapping("/about")
	    public ModelAndView about() {
	         
	        return new ModelAndView("about", "command", new ScreenshotJdo());
	    }
	 @RequestMapping("/features")
	    public ModelAndView features() {
	         
	        return new ModelAndView("features", "command", new ScreenshotJdo());
	    }
	 @RequestMapping("/service")
	    public ModelAndView service() {
	         
	        return new ModelAndView("service", "command", new ScreenshotJdo());
	    }
	 
	 
}