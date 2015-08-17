<%@ include file="/WEB-INF/views/base/base.jsp" %>

<div>

	<form:form method="POST" commandName="course">	
		<table>
			<tr>
				<td>CRN</td>				
				<td ><form:input path="crn" name="crn" cssClass="crn" id="crn"/></td>
				<td><form:errors path="crn" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Subject</td>
				<td><form:input path="subject" name="subject" /></td>
				<td><form:errors path="subject" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Course</td>
				<td><form:input path="course" name="course" /></td>
				<td><form:errors path="course" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Section</td>
				<td><form:input path="section" name="section" /></td>
				<td><form:errors path="section" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Credits</td>
				<td><form:input path="credits" name="credits" /></td>
				<td><form:errors path="credits" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Title</td>
				<td><form:input path="title" name="title" /></td>
				<td><form:errors path="title" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Instructor</td>
				<td><form:input path="instructor" name="instructor" /></td>
				<td><form:errors path="instructor" cssClass="error"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Save" /></td>
			</tr>
			
			<%-- <tr>
				<td><form:errors path="*" cssClass="error" /></td>
			</tr> --%>
		</table>
	</form:form>
	
	<a href="/completed-courses">See Completed Courses</a> <br />
	<a href="/enrolled-courses">See Enrolled Courses</a> <br />
</div>