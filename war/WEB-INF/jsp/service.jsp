 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Login page</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Responsive HTML template for Your company">
    <meta name="author" content="Karthik (karthik@gmail.com)">

    <!-- Le styles -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-responsive.min.css" rel="stylesheet">

    <link rel="stylesheet" href="css/typica-login.css">
    <link rel="shortcut icon" href="favicon.ico">
<script>

function ajaxcall()
{
	var data = {};
	var time = $('#from').val();
	var date=new Date(time);
	var ntime = date.getTime();
	data.ntime;
	console.log("data value:"+data);
	
	$.ajax({
		url:"/addService.html",
		type:"POST",
		dataType:'json',
		contentType:'application/json',
		data: JSON.stringify(data)
	}).done(function(msg){console.log(msg)}).fail(function(msg){console.log(msg)});

}
 }
});
}
</script>
  </head>

  <body>

    <div class="navbar navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </a>
      <!--     <img src="" alt="UserAcitivity PlugIn!" style="height: 70px; width: 500px;"> -->
        </div>
      </div>
    </div>
    <div class="container">

        <div id="login-wraper">
            <form action="addService.html" name="my" class="form login-form" method="post" onsubmit="ajaxcall()">
               <legend> Sign in to <span class="blue">MyService</span></legend>
            
                <div class="body">
                    <label>From:</label>
                    <input type="datetime" id="from" name="from" >
  
                </div>
            
                <div class="footer">
                    <label class="checkbox inline">
                        <input type="checkbox" id="inlineCheckbox1" value="option1"> Remember me
                    </label>
                                
                    <button type="submit" class="btn btn-success">Login</button>
                </div>
            
            </form>
        </div>

    </div>

    <footer class="white navbar-fixed-bottom">
      Don't have an account yet? <a href="register.html" class="btn btn-black">Register</a>
    </footer>


    <!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.js"></script>
    <script src="js/backstretch.min.js"></script>
    <script src="js/typica-login.js"></script>

  </body>
</html>

 
 
 
