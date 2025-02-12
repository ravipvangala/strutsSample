<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- Using Struts2 Tags in JSP --%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main</title>
</head>
<body>
	<ol>
		<li>
			<a href="create.jsp">Create new contact</a>
		</li>
		
		<s:url action="list" var="linkListContactsAction"/>
		
		<li>
			<s:a href="%{linkListContactsAction}">List contacts</s:a>
		</li>
	</ol>
</body>
</html>