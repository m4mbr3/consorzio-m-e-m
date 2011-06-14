<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>twitter Index</title>
</head>
<body>
<p>Hello twitter Index !!!</p>
<p>What are you doing?</p>
<form method="post" action="tweet">
<textarea name="content"></textarea><br />
<input type="submit" value="tweet"/>
</body>
</html>
