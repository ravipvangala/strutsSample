<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- Using Struts2 Tags in JSP --%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update Contact Page</title>
</head>
<body>
	<h1>Update contact</h1>
	<s:form action="update" method="POST">
		<s:hidden name="id" value="%{contact.getId()}" />
		<s:textfield name="name" value="%{contact.getName()}" label="Name" />
		<s:textfield name="number" value="%{contact.getNumber()}" label="Number" />
		<s:submit value="Update" />
	</s:form>
	<a href="index.jsp">Back</a>
</body>
</html>