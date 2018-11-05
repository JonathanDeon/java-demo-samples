<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	I want to read in <a href="?language=en">English</a> || <a href="?language=si">Sinhala</a>

<h1>Add Activity</h1> to <h3>${event.eventName}</h3>
	<form:form commandName="activities">
		<div>
			<div>
				<div><spring:message code="activity.caption"/></div>
				<div>
					<form:input path="activityName" />
				</div>
			</div>

			<div>
				<input type="submit" value="save">
			</div>

		</div>
	</form:form>
</body>
</html>