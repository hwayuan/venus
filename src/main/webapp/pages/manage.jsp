<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ page import=" venus.domain.User" %>  
<%@ taglib prefix="c"           uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="bean"        uri="http://struts.apache.org/tags-bean"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Insert title here</title>
</head>
<body>
	<table border="1" cellpadding="1">
	<tr>
		<td>ACCOUNTID</td>
		<td>PASSWORD</td>  
		<td>NICKNAME</td>
		<td>SEX</td>
		<td>AGE</td>
	</tr>
 	 <c:forEach var="User" items="${userData}">
                  
               <tr>
                    <td>${User.userId}</td>
                    <td>${User.password}</td>
                    <td>${User.nickName}</td>
                    <td>${User.sex}</td>
                    <td>${User.age}</td>
                </tr>
     </c:forEach> 
     </table>
</body>
</html>