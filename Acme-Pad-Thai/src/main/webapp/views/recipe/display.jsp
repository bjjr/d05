<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="display" uri="http://displaytag.sf.net"%>

<display:table pagesize="5" class="displaytag" keepStatus="true"
	name="recipe" requestURI="${requestURI}" id="row">


	<spring:message code="recipe.title" var="titleHeader" />
	<display:column property="title" title="${titleHeader}"
		sortable="false" />
	<br />

	<spring:message code="recipe.ticker" var="tickerHeader" />
	<display:column property="ticker" title="${tickerHeader}"
		sortable="false" />
	<br />

	<spring:message code="recipe.user.name" var="nameUserHeader" />
	<display:column property="user.name" title="${nameUserHeader}"
		sortable="true"></display:column>
	<br />

	<spring:message code="recipe.summary" var="summaryHeader" />
	<display:column property="summary" title="${summaryHeader}"
		sortable="false" />
	<br />

	<spring:message code="recipe.momentAuthored" var="momentAuthoredHeader" />
	<display:column property="momentAuthored"
		title="${momentAuthoredHeader}" sortable="false" />
	<br />

	<spring:message code="recipe.momentLastUpdated"
		var="momentLastUpdatedHeader" />
	<display:column property="momentLastUpdated"
		title="${momentLastUpdatedAddressHeader}" sortable="false" />
	<br />

	<spring:message code="recipe.pictures" var="picturesHeader" />
	<display:column title="${picturesHeader}"
		sortable="false">
		<jstl:forEach var="picture" items=${row.pictures }>
			<img src="${picture}" />
			<br />
		</jstl:forEach>
	</display:column>
	<br />

	<spring:message code="recipe.hints" var="hintsHeader" />
	<display:column title="${hintsHeader}" sortable="false">
		<jstl:forEach var="hint" items=${row.hints }>
			<jstl:out value="${hint }"></jstl:out>
			<br />
		</jstl:forEach>
	</display:column>
	<br />
	
	<spring:message code="recipe.likesSA" var="likesSAHeader" />
	<display:column>
		<jstl:out value="${likesSA}"></jstl:out>
	</display:column>
	<br />
	
	<spring:message code="recipe.dislikesSA" var="dislikesSAHeader" />
	<display:column>
		<jstl:out value="${dislikesSA}"></jstl:out>
	</display:column>
	<br />
	
	<spring:message code="recipe.category.name" var="nameCategoryHeader" />
	<display:column property="category.name" title="${nameCategoryHeader}"
		sortable="true"></display:column>
	<br />
	
</display:table>

<display:table pagesize="5" class="displaytag" keepStatus="true"
	name="comments" requestURI="${requestURI}" id="row">
	
	<spring:message code="comment.title" var="titleHeader" />
	<display:column property="title" title="${titleHeader}"
		sortable="false" />
	<br />
	
	<spring:message code="comment.text" var="textHeader" />
	<display:column property="text" title="${textHeader}"
		sortable="false" />
	<br />
	
	<spring:message code="comment.stars" var="starsHeader" />
	<display:column property="stars" title="${starsHeader}"
		sortable="false" />
	<br />
	
	<spring:message code="comment.identity" var="identityHeader" />
	<display:column property="identity" title="${identityHeader}"
		sortable="false" />
	<br />
	
	<spring:message code="comment.moment" var="momentHeader" />
	<display:column property="moment" title="${momentHeader}"
		sortable="false" />
	<br />
	
</display:table>


