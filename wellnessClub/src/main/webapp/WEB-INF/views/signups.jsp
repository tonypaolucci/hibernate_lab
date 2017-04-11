<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
    
  </head>
  <body>
	<header>		
		<nav class="navbar navbar-default navbar-static-top" role="navigation">
			<div class="navigation">
				<div class="container">					
					<div class="navbar-header">
						<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse.collapse">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>						
					</div>
					
					<div class="navbar-collapse collapse">							
						<div class="menu">
							<ul class="nav nav-tabs" role="tablist">
								<li><a href="index">Home</a></li>
								<li><a href="about">About Us</a></li>
								<li ><a href="products">products</a></li>								
								<li class="active"><a href="contact">Contact Us</a></li>
								<li ><a href="calculate">calculate</a></li>			
								</ul>
						</div>
					</div>						
				</div>
			</div>	
		</nav>		
	</header>
   
	<div class="container">	
			<div class="container">
		     <h1 style="color: #008000">Wellness registration </h1>
			 
			 <h2 style="color: #008000">Try a two week trial now! </h2>
			 
			 
			 
	</div>
<form id="signupForm" method="post" action="signupMember">

	<div class="contact form">
		<div class="container">
			 <div class="col-md-4" >
			 	<div class="form-group">
                              <label for="ln" id='eln' >First Name*</label>
                              <input type=text id="fname" name="Fname" class="form-control input-sm" placeholder="First Name" > 
                           </div>
                           <div class="form-group">
                              <label for="ln" id='eln' >Last Name*</label>
                              <input type=text id="lname" name="lname" class="form-control input-sm" placeholder="Last Name" > 
                           </div>
                           
                     </div>
		</div>
	</div>
	
</form>	
	
   
  </body>
   <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 	 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	
</html>