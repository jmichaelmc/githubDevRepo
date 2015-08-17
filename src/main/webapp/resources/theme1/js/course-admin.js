/**
 * applies to tags in course-admin.jsp
 */
$(document).on('change', $('.crn'), function() {
	alert($('#crn').val());
	if (!$isNumeric($('#crn').val())) {
		alert("isn't numeric");
		alert($('#crn').val() + " is not applicable. CRN must be a numeric value.");
	}
});

