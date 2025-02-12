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

				<td><s:url action="GetContact" var="linkUpdateContact">
						<s:param name="contactId">
							<s:property value="#contact.id" />
						</s:param>
					</s:url> <s:a href="%{linkUpdateContact}">Update</s:a></td>

				<td><s:url action="DeleteContact" var="linkDeleteContact">
						<s:param name="contactId">
							<s:property value="#contact.id" />
						</s:param>
					</s:url> <s:a href="%{linkDeleteContact}">Delete</s:a></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>