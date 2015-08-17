<%@ include file="/WEB-INF/views/base/base.jsp" %>

<div>
	<form method="POST">
        <table>
            <tr>
                <td>Please select:</td>
                <td>
                	<form:select path="course" items="${ courses }" />
                </td>
            </tr>
        </table>
    </form>
    
    <a href="/course-admin">Configure Courses</a> <br />
	<a href="/completed-courses">See Completed Courses</a> <br />
</div>