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

<form:form action="card/customer/edit.do" modelAttribute="card">
	<form:hidden path="id" />
	<form:hidden path="version" />
	<div>
		<p>Title</p>
		<form:input path="title" />
	</div>
	<div>
		<p>Text</p>
		<form:textarea path="text" />
	</div>
	<div>
		<p>Background</p>
		<form:select id="backgrounds" path="background">
			<form:option value="0" label="----" />
			<form:options items="${backgrounds}" itemValue="id" itemLabel="title" />
		</form:select>
	</div>
	<div>
		<input type="submit" name="save"
			value="<spring:message code="card.save" />" />;
		<jstl:if test="${card.id != 0}">
			<input type="submit" name="delete"
				value="<spring:message code="card.delete" />"
				onclick="return confirm('<spring:message code="card.confirm.delete" />')" />&nbsp;
	</jstl:if>
		<input type="button" name="cancel"
			value="<spring:message code="card.cancel" />"
			onclick="relativeRedir('card/customer/list.do')" /> <br />
	</div>



</form:form>