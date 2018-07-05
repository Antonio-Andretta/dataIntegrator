<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Data Integrator</title>
</head>
<body>
	<%
	if(request.getParameter("userLogin") != null && 
		request.getParameter("userLogin") == "" ) {
            out.write("Usuário Invalido");
	}
	
	if(request.getParameter("pwdLogin") == null) {
	    out.write("Senha Invalida");
	}
	
    %>
             
</body>
</html>