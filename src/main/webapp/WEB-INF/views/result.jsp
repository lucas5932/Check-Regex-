<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h3>result.jsp</h3>
<hr>
이름 : ${std.name}<br>
아이디 : ${requestScope.std.id}<br>

<input type="button" value="Back" onclick="javascript:history.go(-1)">