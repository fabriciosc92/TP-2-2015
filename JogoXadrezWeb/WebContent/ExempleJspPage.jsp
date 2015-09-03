<%@page import="model.ExempleModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<table border='1'>
		<% for(int i =0;i<8;i++)
		{ %>
			<tr>
				<% for(int j=0;j<8;j++)
				{ %>
					<td> 
						
						<form method="get" action="Exemple">
						<!-- na forma de formulario-->
						<!-- 	<input type="hidden" name="par" value="<%= new ExempleModel(i,j) %>"></input> -->
						<!-- na forma de link -->
						<!--   <a href="Exemple?par=<%= new ExempleModel(i,j) %>"><%= i+","+j %></a>-->					
						<!-- botao do formulario-->
						<!-- <button type='submit'><%= i+","+j %> </button> -->
						<%= i+","+j %>
						</form>
					</td>
				<%} %>
			</tr>
		<%} %>
		</table>
	</body>
</html>