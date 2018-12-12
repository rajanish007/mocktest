$(document).ready(function () {
    $("#start-test").click(function () {
        window.location.replace(window.location.origin + "/test/new?studentId=" + $("#studentId").val());
    });
})