<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- Using Struts2 Tags in JSP --%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List contacts page</title>
</head>
<body>
	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Number</th>
		</tr>
		<s:iterator value="contacts" var="contact">
			<tr>
				<td><s:property value="#contact.id" /></td>

				<td><s:property value="#contact.name" /></td>

				<td><s:property value="#contact.number" /></td>

				<td><s:url action="get" var="linkUpdateContactAction">
						<s:param name="contactId">
							<s:property value="#contact.id" />
						</s:param>
					</s:url> <s:a href="%{linkUpdateContactAction}">Update</s:a></td>

				<td><s:url action="delete" var="linkDeleteContactAction">
						<s:param name="contactId">
							<s:property value="#contact.id" />
						</s:param>
					</s:url> <s:a href="%{linkDeleteContactAction}">Delete</s:a></td>
			</tr>
		</s:iterator>
	</table>
	<a href="index.jsp">Back</a>
</body>
</html>