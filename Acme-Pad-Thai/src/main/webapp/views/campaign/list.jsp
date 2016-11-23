<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="display" uri="http://displaytag.sf.net"%>

<display:table name="campaigns" id="row"
	requestURI="campaign/sponsor/list.do" pagesize="5" class="displaytag">

	<spring:message code="campaign.start" var="start" />
	<display:column property="start" title="${start}" sortable="true">
		<jstl:out value="${row.start}" />
	</display:column>


	<spring:message code="campaign.end" var="end" />
	<display:column property="end" title="${end}" sortable="true">
		<jstl:out value="${row.end}" />
	</display:column>

	<spring:message code="campaign.banners" var="bannners" />
	<display:column property="banners" title="${banners}" sortable="true">
		<jstl:out value="${row.banners}" />
	</display:column>

	<spring:message code="campaign.maxDisplayed" var="maxDisplayed" />
	<display:column property="maxDisplayed" title="${maxDisplayed}"
		sortable="true">
		<jstl:out value="${row.maxDisplayed}" />
	</display:column>

	<spring:message code="campaign.displayed" var="displayed" />
	<display:column property="displayed" title="${displayed}"
		sortable="true">
		<jstl:out value="${row.displayed}" />
	</display:column>

	<jstl:if test="${row.star==true}">
		<spring:message code="campaign.star" var="star" />
	</jstl:if>
</display:table>