<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
    
<h3>form.jsp</h3>
<hr>
<style type="text/css">
.err{
	font-size : 9pt;
	color : red;
	font-weight: bold;
}
</style>
<form:form commandName="std" action="form" method="post">
	이름 : <input type="text" name="name" value="${std.name}">
	<form:errors cssClass="err" path="name"/><br>
	아이디 : <input type="text" name="id" value="${std.id}">
	<form:errors cssClass="err" path="id"/><br>
	<input type="submit" value="전송">
</form:form>