$(document).ready(function () {

    $.ajax({
        async : false
    })

    $("#register-button").click(function () {
       get("/login/new/student");
    });

    $("#login-form").submit(function (event) {
        event.preventDefault();
        var username = $("#inputUsername").val();
        var password = btoa($("#inputPassword").val());
        var url = $("#context-path").val() + "login/check?username=" + username + "&password=" + password;
        if(username != "" && password != ""){
            var statusCode = get(url);
            if(statusCode == "200"){
                $("#auth-success-alert").show();
            }else{
                $("#auth-fail-alert").show();
            }
        }
    });

    $("#registration-form").submit(function (event) {
        event.preventDefault();
        if($("#inputPassword1").val() !== $("#inputPassword1").val()){
            $("#pass-unmatch-alert").show();
            return;
        }else{
            var data = preparePayload($("#registration-form").serialize().split("&"));
            var url = $("#context-path").val() + "/student/new";
            var statusCode = post(url,data);
            console.log("i was called");
            if(statusCode == "200"){
                $("#reg-success-alert").show();
            }else{
                $("#reg-fail-alert").show();
            }
        }
    });
});

function preparePayload(data) {
    var obj={};
    for(var key in data)
    {
        console.log(data[key]);
        obj[data[key].split("=")[0]] = data[key].split("=")[1];
    }
    return JSON.stringify(obj);
}