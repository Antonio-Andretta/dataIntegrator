<%@ page language="java"  contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    	               "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
    	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    	<title>Data Integrator</title>
    	<link rel="stylesheet" href="css/dit001_style.css">
  </head>
  <body>
    <h1>Data Integrator</h1>
    
    <div >
    <form name="FormLogin" action="login.jsp" method="post" >
    	<div class="row" >
    	<p class="ploginTitle">Login</p>
    	</div>
    	<div class="row">
    		<div class="col-25">
    			<label for="luser">User Id:</label>
    		</div>
    	
    		<div class="col-75">
    			<input class="plog" type="text" name="userLogin" />
    		</div>
    	</div>
    	
    	<div class="row">
    		<div class="col-25">
    			<label for="lpass">Password:</label>
    		</div>
    	
    		<div class="col-75"> 
    			<input class="plog" type="password" name="pwdLogin" />
    		</div>
    	</div>	
    	
    	<div class="row" padding="5px" >
    		<input type="submit" name="btlog"    label="OK"     value="OK" class="bt01" />
    		<input type="submit" name="btcancel" label="Cancel" value="Cancel" class="bt01"/>
    	</div>
    	    
    </form>
    </div>
    
    
    
  </body>
</html> 
