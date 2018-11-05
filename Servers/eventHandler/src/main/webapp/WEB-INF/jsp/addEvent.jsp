<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
.errorText {
	color: #ff0000;
}

.errorBanner {
	color: #000000;
	background-color: #ffeeee;
	border: 3px solid #ff0000;
	margin: 16px;
	padding: 8px;
}
</style>
</head>
<body>
	<form:form commandName="event">
	<form:errors path="*" cssClass="errorBanner" element="div"/>
		<div>
			<h1>Event</h1>
		</div>
		<div>Enter event name</div>
		<div>
			<form:input path="eventName" />
		</div>
		<div>
			<input type="submit" value="save">
		</div>
	</form:form>
</body>
</html>