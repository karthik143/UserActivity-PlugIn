  <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.Date,java.text.DateFormat,java.text.SimpleDateFormat,java.util.Calendar,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>User Activity</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	
    <!-- Styles -->
    <link href="css/bootstrap.min.css" rel="stylesheet" />
    <link rel="stylesheet" href="css/bootstrap-overrides.css" type="text/css" />
    <link rel="stylesheet" type="text/css" href="css/theme.css" />
     <link href="css/notepad.css" rel="stylesheet" />
    <link href='http://fonts.googleapis.com/css?family=Lato:300,400,700,900,300italic,400italic,700italic,900italic' rel='stylesheet' type='text/css' /> 

    <link rel="stylesheet" href="css/index.css" type="text/css" media="screen" />    
    <link rel="stylesheet" type="text/css" href="css/animate.css" media="screen, projection" />    

    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
</head>
<body class="pull_top">
    
    <div class="navbar navbar-inverse navbar-fixed-lop" role="navigation">
        <div class="container">
            <div class="navbar-header">
            <!-- signup strip -->
    <div class="background-grey strip">
      <div class="container">
        
      

        <div class="pull-right"><a href="#signup-modal" class="btn btn-info btn-huge btn-simple" data-toggle="modal">Sign up now</a></div>

      </div>
    </div>
            
                <button type="button" class="navbar-toggle pull-right" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">WELCOME</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                
                <a href="index.html" class="navbar-brand"><strong>User Activity PlugIN</strong></a>
            </div>

            <div class="collapse navbar-collapse navbar-ex1-collapse" role="navigation">
                <ul class="nav navbar-nav navbar-right">
                    <li class="active"><a href="home.html">HOME</a></li>
                    <li><a href="about.html">ABOUT US</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">PAGES <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="features.html">Features</a></li>
                             <li><a href="service.html">Services</a></li>
                         
                        </ul>
                    </li>
                   
                   
                    <li><a href="contacts.html">Sign in</a></li>
                </ul>
            </div>
        </div>
    </div>

    <section id="feature_slider" class="lol">
        <!-- 
            Each slide is composed by <img> and .info
            - .info's position is customized with css in index.css
            - each <img> parallax effect is declared by the following params inside its class:
            
            example: class="asset left-472 sp600 t120 z3"
            left-472 means left: -472px from the center
            sp600 is speed transition
            t120 is top to 120px
            z3 is z-index to 3
            Note: Maintain this order of params

            For the backgrounds, you can combine from the bgs folder :D
        -->
        <article class="slide" id="showcasing" style="background: url('mackbook.png') repeat-x top center;">
            <img class="asset left-30 sp600 t120 z1" src="d.jpg" />
              
            <div class="info">
                <h2>User Activity Spy PlugIN</h2>
            </div>
        </article>
        <article class="slide" id="ideas" style="background: url('aqua.jpg') repeat-x top center;">
            <div class="info">
                <h2>We Are Giving Beautiful Secure Services</h2>
            </div>
            <img class="asset left-480 sp600 t260 z1" src="22.png" />
            <img class="asset left-210 sp600 t213 z2" src="33.jpg" />
            <img class="asset left60 sp600 t260 z1" src="44.jpg" />
        </article>
        <article class="slide" id="tour" style="background: url('color-splash.jpg') repeat-x top center;">
            <img class="asset left-472 sp650 t210 z3" src="ipad.png" />
            <img class="asset left-365 sp600 t270 z4" src="iphone.png" />
            <img class="asset left-350 sp450 t135 z2" src="desktop.png" />
            <img class="asset left-185 sp550 t220 z1" src="macbook.png" />
            <div class="info">
                <h2>Fully Responsive For Your Product</h2>
                <a href="features.html">We Invites You</a>
            </div>
        </article>
        <article class="slide" id="responsive" style="background: url('indigo.jpg') repeat-x top center;">
            <img class="asset left-472 sp600 t120 z3" src="b.png" />
            <img class="asset left-190 sp500 t120 z2" src="" />
            <div class="info">
                <h2>
                 Can <strong>You</strong>
                   Break Me???????
                </h2>                
            </div>
        </article>        
    </section>
    
    
               

 <div id="features">
        <div class="container">
            <div class="section_header">
                <h3>Features</h3>
            </div> 
            <div class="row feature">
                <div class="col-sm-6">
                    <img src="img53.jpg" class="img-responsive" />
              
                    <img src="final.jpg" class="pull-right img-responsive" />
                </div>
                <div class="col-sm-6 info info-left">
                    <h3>
                   UCD Management in Software Development 
Processes:
                    </h3>
                    <p>
                        The ability to steer and control the UCD activities
 within the 
development environment of the project.

Integration of UCD management at Integrated 
Development Environment (
IDE
) level automates UCD 
activities across different development phases; hen
ce,

Decreases the time and cost to manage UCD activitie
s and to 
evaluate each unit

Enhances the collaboration among the people in deve
lopment 

Improves the overall quality of both: the developme
nt process 
and the product
                    </p>
                </div>                
            </div>
            
                </div>
            </div>
        </div>
     <!-- starts footer -->
    <footer id="footer">
        <div class="container">
            <div class="row sections">
                <div class="col-sm-4 recent_posts">
                   
                <div class="col-sm-4 testimonials">
                    <h3 class="footer_header">
                        Testimonials
                    </h3>
                    <div class="wrapper">
                        <div class="quote">
                            <span></span>
                            There are many variations of passages of randomised words which don't look even slightly believable. You need to be sure there isn't anything embarrassing of text.
                            <span></span>
                        </div>
                        <div class="author">
                            <img src="user-display.png" />
                            <div class="name">Alejandra Galvan Castillo</div>
                            <div class="info">
                                Details Canvas
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-sm-4 contact">
                    <h3 class="footer_header">
                        Contact
                    </h3>
                    <form action="#" method="post">
                        <input type="text" placeholder="Your name" />
                        <input type="text" placeholder="Your email" />
                        <textarea rows="3" placeholder="Message"></textarea>
                        <input type="submit" value="Send" />
                    </form>
                </div>
            </div>
            <div class="row credits">
                <div class="col-md-12">
                    <div class="row social">
                        <div class="col-md-12">
                            <a href="#" class="facebook">
                                <span class="socialicons ico1"></span>
                                <span class="socialicons_h ico1h"></span>
                            </a>
                            <a href="#" class="twitter">
                                <span class="socialicons ico2"></span>
                                <span class="socialicons_h ico2h"></span>
                            </a>
                            <a href="#" class="gplus">
                                <span class="socialicons ico3"></span>
                                <span class="socialicons_h ico3h"></span>
                            </a>
                            <a href="#" class="flickr">
                                <span class="socialicons ico4"></span>
                                <span class="socialicons_h ico4h"></span>
                            </a>
                            <a href="#" class="pinterest">
                                <span class="socialicons ico5"></span>
                                <span class="socialicons_h ico5h"></span>
                            </a>
                            <a href="#" class="dribble">
                                <span class="socialicons ico6"></span>
                                <span class="socialicons_h ico6h"></span>
                            </a>
                            <a href="#" class="behance">
                                <span class="socialicons ico7"></span>
                                <span class="socialicons_h ico7h"></span>
                            </a>
                        </div>
                    </div>
                    <div class="row copyright">
                        <div class="col-md-12">
                            © 2014   ADAPTAVANT. All rights reserved.
                        </div>
                    </div>
                </div>            
            </div>
        </div>
        
         <!-- signup strip -->
   
        
        <!-- SignUp modal -->
   
     <form method="post" class="form-horizontal" action="/addEmail.html"> 
    <div id="signup-modal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">Welcome</button>
        <h3 id="myModalLabel" class="centered">Sign Up</h3>
      </div>
      <div class="modal-body">
       
          <div class="control-group">
            <label class="control-label" for="inputUser">FirstName//</label>
            <div class="controls">
              <input type="text" name=first id="FirstName"/>
            </div></div>
            
             <div class="control-group">
            <label class="control-label" for="inputUser">LastName//</label>
            <div class="controls">
              <input type="text" name=last id="LastName"/>
            </div></div>
            
             <div class="control-group">
            <label class="control-label" for="inputUser">UserName//</label>
            <div class="controls">
              <input type="text" name=user  id="UserName"/>
            </div> </div>
            
             <div class="control-group">
            <label class="control-label" for="inputUser">Password//</label>
            <div class="controls">
              <input type="password" name=pass id="Password" />
            </div> </div>
            
             <div class="control-group">
            <label class="control-label" for="inputUser">Mobile//</label>
            <div class="controls">
              <input type="text" name=mobile id="Mobile">
            </div> </div>
            
             <div class="control-group">
            <label class="control-label" for="inputUser">Location//</label>
            <div class="controls">
              <input type="text" name=location id="Location"/>
            </div> </div>
             
           <div class="control-group">
            <label class="control-label" for="inputUser">Email//</label>
            <div class="controls">
              <input type="text" name=email id="Email"/>
            </div>
          </div>
          <%
     	 Calendar cal = Calendar.getInstance();
     	 DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); 
          %> 
            <div class="control-group">
            <label class="control-label" for="inputUser">Date//</label>
            <div class="controls">
        <input type="text" name=date id="date" value="<%=dateFormat.format(cal.getTime())%>" readonly/>
            </div>
          </div>
      
      </div>
      <div class="modal-footer">
        <button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
        <button type="submit" class="btn btn-info">Register</button>
      </div>
    </div>
  </form>
        
        
        
    </footer>
    <!-- Scripts -->
    <script src="js/jquery-latest.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/theme.js"></script>

    <script type="text/javascript" src="js/index-slider.js"></script>	
</body>
</html>