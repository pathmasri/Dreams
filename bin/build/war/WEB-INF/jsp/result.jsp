<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import = "java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
  <script src="js/webmodule_1.js" type="text/javascript"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Houses for sales</title>
</head>
<body>

<h1 align="center"> Available houses for sale </h1> 

<%
 List homes = (List)request.getAttribute("homes");
 Iterator it = homes.iterator();
		while (it.hasNext()){
			out.print(it.next().toString());
		}
%>

   <FORM NAME="form1" METHOD="POST" action="selecthome.do">
      <INPUT TYPE="BUTTON" VALUE="JS Test" ONCLICK="load()">
      <input type="submit" value = "call EJB 1">
      <input type="hidden" value="testEJB">
  </FORM>

</body>
</html>