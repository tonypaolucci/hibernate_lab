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
								<li ><a href="contact">Contact Us</a></li>
								<li class="active"><a href="calculate">calculate</a></li>
								</ul>
						</div>
					</div>						
				</div>
			</div>	
		</nav>		
	</header>
	
    <form action="area" method="post" style="color: #008000">

                     <div class="col-md-3">
                           <div class="form-group">

							<input type="text"  id="name" name="name" value="${name}" class="form-control input-sm" placeholder="name" ><label for="wt" id="wt">Enter shape</label>
                             <input type="text"  id="ws" name="ws" value="${ws}" class="form-control input-sm" placeholder="Weight" ><label for="wt" id="wt">Enter width</label>
                             <input type="text"  id="hs" name="hs" value="${hs}" class="form-control input-sm" placeholder="height" ><label for="ht" id="ht">Enter Height</label>

                           </div>
                            <div>${name}</div>
                           <div>${area}</div>
                     </div>
                           <button type="submit" name="submit" id="submit" class="btn btn-primary" >Calculate</button>
                                       <a href="calculate" class="btn btn-primary">
                                                                                <i class="glyphicon glyphicon-refresh"></i> Refresh
                                                                            </a><br>



        </form>
	<div class="container">	
	
		<div class="text-success">
			<h1 class="panel-title"></h1>
		<img src=https://inanage.files.wordpress.com/2012/09/gw2_sell-all-the-things.jpg>
		</div>
		<div class="panel-body">
		
		<p  class="text-info">${msg}</p>	
			
		</div>
     </div>
		
   
  </body>
   <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 	 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	
</html>
