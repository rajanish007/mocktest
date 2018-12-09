$(document).ready(function () {

    $("#new-querie-form").submit(function (event) {
        event.preventDefault();
        var url = window.location.origin + "/querie/new"
        var payload = toJSONString(this);
        var statusCode = post(url,payload);
        if(statusCode == 200)success_alert("Query Creation Successful !");
        else danger_alert("Query Creation FAILED !");
        $('#exampleModalCenter').modal('hide');
        window.location.reload();
    });
});