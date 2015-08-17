<%@ include file="/WEB-INF/views/base/base.jsp" %>

<div>

	Completed Courses
	<c:forEach var="course" items="${ courses }">
		<ul>
			<li><c:if test="${ course.title != null }">
					<c:out value="${ course.title }" />
				</c:if></li>
		</ul>
	</c:forEach>
	
	<a href="/course-admin">Configure Courses</a> <br />
	<a href="/enrolled-courses">See Enrolled Courses</a> <br />

</div>