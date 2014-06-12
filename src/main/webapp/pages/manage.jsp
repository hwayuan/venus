<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ page import=" venus.domain.User" %>  
<%@ taglib prefix="c"           uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Insert title here</title>
</head>
<body>
	 <c:forEach var="message" items="${userData}">
                <tr>
                    <td>${message.accountId}</td><td>${message.nickName}</td>
                </tr>
     </c:forEach>
</body>
</html>