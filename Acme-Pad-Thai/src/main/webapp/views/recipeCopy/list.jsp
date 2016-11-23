<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="display" uri="http://displaytag.sf.net"%>

<display:table name="recipeCopies" id="row"
	requestURI="recipeCopy/list.do" pagesize="5" class="displaytag">

	<spring:message code="recipeCopy.ticker" var="ticker" />
	<display:column property="ticker" title="${ticker}" sortable="true">
		<jstl:out value="${row.ticker}" />
	</display:column>


	<spring:message code="recipeCopy.title" var="title" />
	<display:column property="title" title="${title}" sortable="true">
		<jstl:out value="${row.title}" />
	</display:column>

	<spring:message code="recipeCopy.summary" var="summary" />
	<display:column property="summary" title="${summary}" sortable="true">
		<jstl:out value="${row.summary}" />
	</display:column>

	<spring:message code="recipeCopy.nameUser" var="nameUser" />
	<display:column property="nameUser" title="${nameUser}" sortable="true">
		<jstl:out value="${row.nameUser}" />
	</display:column>

	<jstl:if test="${row.winner==true}">
		<p>Ganador</p>
	</jstl:if>

</display:table>