<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title><tiles:insertAttribute name="title" ignore="true" /></title>
                <tiles:insertAttribute name="layoutCssJs"/>
                <tiles:insertAttribute name="customCssJs" ignore="true"/>
	</head>
	<body>
            <div class="container">
                <div class="row">
                    <div class="col-md-offset-2 col-md-20">
		<tiles:insertAttribute name="header" />
		<tiles:insertAttribute name="body" />
		<tiles:insertAttribute name="footer" />
                    </div>
                </div>
            </div>
	</body>
</html>