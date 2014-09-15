<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<title>Toyota Car Configurator</title>

</head>
<body>
	<h1>Toyota Car Configurator</h1>

	<h2>Select a car model:</h2>

	<form:select path="selectedCar">
		<form:options items="${carsList}" itemLabel="modelName"/>
	</form:select>


</body>
</html>