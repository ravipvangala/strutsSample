<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- Using Struts2 Tags in JSP --%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Create Contact Page</title>
</head>
<body>
	<h1>Create a new contact</h1>
	<s:form action="create" method="POST">
		<s:textfield name="name" label="Name"/>
		<s:textfield name="number" label="Number"/>
		<s:submit value="Save contact"/>
	</s:form>
	<br/>
	<a href="index.jsp">Back</a>
</body>
</html>