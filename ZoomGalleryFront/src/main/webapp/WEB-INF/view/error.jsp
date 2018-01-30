<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="icon" href="<c:url value="/images/favicon.ico"/>" type="image/jpg"/>
<title>Error</title>
</head>
<body>
<%@ include file="/WEB-INF/view/header.jsp" %>

<c:if test="${not empty error }">
	<div class="container">
  <div class="jumbotron">
    <h1>Aha! Caught you</h1>      
    <h2>${error}</h2>      
</div>
</div>
</c:if>

<%@ include file="/WEB-INF/view/footer.jsp" %>
</body>
</html>