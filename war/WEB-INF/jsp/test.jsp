<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<%@ page import="java.net.InetAddress"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.text.DateFormat"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Calendar"%>
<%@ page import="java.util.*"%>
<%@ page import="com.google.appengine.api.blobstore.BlobstoreService"%>
<%@ page import="com.google.appengine.api.blobstore.BlobstoreServiceFactory"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java"%>
 <%
 BlobstoreService blobstoreService = BlobstoreServiceFactory.getBlobstoreService();
%>
<!DOCTYPE html>
<html lang="en">
  <head>
 <!-- <meta http-equiv="refresh" content="10; URL=http://localhost:8888/addLogin" /> -->
    <meta charset="utf-8">
    <title>Login page </title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Responsive HTML template for Your company">
    <meta name="author" content="Oskar Żabik (oskar.zabik@gmail.com)">
<script type="text/javascript" src="../../js/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="../../js/html2canvas.js"></script>
<script type="text/javascript" src="../../js/jquery.plugin.html2canvas.js"></script>
    <!-- Le styles -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-responsive.min.css" rel="stylesheet">

    <link rel="stylesheet" href="css/typica-login.css">

    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <!-- Le favicon -->
    <link rel="shortcut icon" href="favicon.ico">
 <script type="text/javascript">
 
 /* document.getElementById("container").style.display = "block";
  */
 
/*  window.onload=function(){ 
	    window.setTimeout(function() { document.cartCheckout.Register(); }, 5000);
	};
	 */
	
	
 var inc=0;
 function lstore() { 

  // Check for LocalStorage support.
  if (localStorage) 
  {
	  //localStorage.clear();
          var timezone = document.getElementById('timezone').value;
	      var date = document.getElementById('date').value;
	      var hostaddress = document.getElementById('hostaddress').value;
	      var Email= document.getElementById('Email').value;
	      var hostname = document.getElementById('hostname').value;
	      var operatingsystem = document.getElementById('operatingsystem').value;
	      var imgtxt = document.getElementById('imgtxt').value;
	      
	      var blobkey=document.getElementById("blobkey").value;
	      
         
	      console.log(blobkey);
	      localStorage.setItem(inc+Email+'timezone',timezone );
	      localStorage.setItem(inc+Email+'date',date );
	      localStorage.setItem(inc+Email+'hostaddress',hostaddress); 
	      localStorage.setItem(inc+'Email',Email);
	      localStorage.setItem(inc+Email+'hostname', hostname);
	      localStorage.setItem(inc+Email+'operatingsystem',operatingsystem ); 
	      localStorage.setItem(inc+Email+'blobkey',JSON.stringify(blobkey)); 
	      inc++;
           
  }

}
	    
 var imgString;
 function readURL(input) {
	    if (input.files && input.files[0]) {
	        var reader = new FileReader();
	        reader.onload = function (e) {
	            $('#preview').attr('src', imgstring);
	         
	        }
	        reader.readAsDataURL(input.files[0]);
	    }
	}

	
 function captures() {
         html2canvas($('body'),{
             onrendered: function (canvas) {      
            	 
                          imgString = canvas.toDataURL("image/png");
                          
                         //window.open(imgString);  
                        window.open(imgString);
                         $('#preview').attr('src', imgString);
        	        	 console.log(imgString);
        	        	 lstore();   
        	        	 timing();
        	        	 ajaxcall("/addContact.html");
        	     		ajaxcall("/sendEmail.html");
        	        	 document.getElementById("imgtxt").style.visibility="hidden"; 
        	        	  localStorage.setItem(inc+Email+'imgtxt', imgString);
                         //document.write(document.URL);


                         console.log("program to start");
		//console.log( imgString);
		
		function ajaxcall(urlAddr)
		{
			
			
			var data = {};
			data.timezone = $('#timezone').val();
			data.date = $('#date').val();
			data.hostaddress = $('#hostaddress').val();
			data.email = $('#Email').val();
			data.hostname = $('#hostname').val();
			data.operatingsystem = $('#operatingsystem').val();
			data.image = imgString;
			
			console.log("data value:"+data);
			
			$.ajax({
				url:urlAddr,
				type:"POST",
				dataType:'json',
				contentType:'application/json',
				data: JSON.stringify(data)
			}).done(function(msg){console.log(msg)}).fail(function(msg){console.log(msg)});

		}
		
         }
     });
 }
 
 
	var i = 0;

	function timing() {
		i++;
		if (i <10) {
			setTimeout("timing()", 5000);
		} else {
			captures();
			i = 0;
			timing();
		}
	}


     </script>
	  </head>

  <body onload="captures()" >
  <!-- <div id="container2" style="display:none"> -->
  
    <div class="navbar navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </a>
        <!--   <a class="brand" href="contact.html"><img src="" style="height: 80px; width: 1800px;" alt="UserActivity PlugIn!"></a> -->
        </div>
      </div>
    </div>

    <div class="container">
        <div class="row">

        	<div class="span6">
        		
        		<!-- <div class="register-info-wraper">
        			<div id="register-info">
        				<h1><img src="zzlogo.png" style="height: 350px; width: 450px;" alt="Typica - Bootstrap Awesome Template!"></h1>
        				<ul dir="rtl">
        					<li>User Activity Spy PlugIn</li>
        					
        				</ul>
        				
        			</div>
        		</div> -->
<div class="register-info-wraper">
        			<div id="register-info">
        			
        				<h1>You are about 30 seconds away from using this awesome app. Good choice!</h1>
        			
        				<ul dir="rtl">
        					<li>Blah blah blah</li>
        					<li>That's why this app is so awesome</li>
        					<li>!So register, like, right NOW</li>
        					<li>Or don't, who cares</li>
        				</ul>
        				
        			</div>
        		</div>

        	</div>

        	<div class="span6">
        		<div id="register-wraper"> 
        		 <form action="<%= blobstoreService.createUploadUrl("/addContact.html") %>"
		method="POST" enctype="multipart/form-data" id=registerForm> 
	
        		  <%--  <form method="post" action="addContact.html" id="contactForm">  --%>
        		     <legend>  Register to <span class="blue">MyApp</span></legend>
        		    
        		        <div class="body">
        		 
        		        
        		        <%
        		      
        		        TimeZone tz = Calendar.getInstance().getTimeZone();
        		        %>
        		        	<!-- first name -->
        		        	<div class="control-group control-inline">
        		        		<label for="timezone">Time Zone</label>
        		        		<input name="timezone" class="input-medium" id=timezone value="<%=tz.getDisplayName()%>" readonly>
        		        	</div>
        		        	
        		        	<% 
        		        	 Calendar cal = Calendar.getInstance();
        		        	 DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        		        	%> 
        		        	<!-- last name -->
        		        	<div class="control-group control-inline">
        		        		<label for="date">Date</label>
        		        		<input name="date" class="input-medium"  id=date value="<%=((Long)cal.getTimeInMillis()).toString()%>" readonly>
        		        	</div>
        		        	
        		        	
        		             	<% 
        		        		InetAddress inet = InetAddress.getLocalHost();

        		             	%>
        		        	    
        		             	<label for="hostaddress">Hostaddress</label>
        		        		<input name="hostaddress" class="input-medium"  id=hostaddress value="<%=inet.getHostAddress()%>" readonly>
        		        		
        		        		
                                
        		             	<label for="email">Email</label>
        		        		<input name="email" class="input-medium" type="text" id="Email" value="${mailid}" readonly >
        		        		
        		        		
        		        		
        		        		<% 
        		        		InetAddress ip = InetAddress.getLocalHost();
		                       
        		             	%>
        		        		
        		             	<label for="hostname">Hostname</label>
        		        		<input name="hostname" class="input-medium" id=hostname value="<%=ip.getHostName() %>" readonly>
        		        		
                              
                                  <%
                                   String userAgent = request.getHeader("user-agent");
                                   %>
                                
        		             	<label for="operatingsystem">OS</label>
        		        		<input  name="operatingsystem" class="input-medium" id=operatingsystem  value="<%=userAgent %>" readonly>
        		               
        		               
        		             	<label for="blobkey">BlobKey</label>
        		        		<input name="blobkey" class="input-medium" type="text" id="blobkey" value="${blobkey}"readonly >
        		             
        		       
        		             	<label for="imgtxt"></label>
        		        		<input name="imgtxt" id=imgtxt class="input-medium" />
        		        		
        		        	
        		        	
        		        </div>
        		        <div class="footer">
        		            <label class="checkbox inline">
        		                <input type="checkbox" id="inlineCheckbox1" value="option1"> I agree to something I will never read
        		            </label>
        		            <a href="#" id="register" ><button type="button" class="btn btn-success"  >Register</button></a>
        		        </div>
        		    </form>
        		</div>
        	</div>

        </div>
    </div>

    <footer class="white navbar-fixed-bottom">
      Already have an account? <a href="contacts.html" class="btn btn-black">Sign in</a>
    </footer>


    <!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.js"></script>
    <script src="js/backstretch.min.js"></script>
    <script src="js/typica-login.js"></script>
   
  <%--  <%
   response.sendRedirect("first.html");
   %> --%>
  
  </body>
</html>


