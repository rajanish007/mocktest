$(document).ready(function () {
    $("#registration-link").attr("href",
        $("#registration-link").val() + "/login/new?isFaculty=" + getUrlParameter("isFaculty"));

    if(getUrlParameter("isFaculty") == "true"){
        $("#f-portal").show();
        $("#s-portal").hide();
    }else{
        $("#f-portal").hide();
        $("#s-portal").show();
    }

    $("#login-form").submit(function (event) {
        event.preventDefault();
        var username = $("#inputUsername").val();
        if ($("#inputPassword").val().length > 20) {
            danger("Password length must be maximum 20 characters !");
            return;
        } else if ($("#inputUsername").val().length > 20) {
            danger("Username length must be maximum 20 characters !");
            return;
        } else {
            var password = btoa($("#inputPassword").val());
            var url = window.location.origin + "/login/check?username=" +
                username + "&password=" + password +
                "&isFaculty=" + getUrlParameter("isFaculty");
            if (username != "" && password != "") {
                var statusCode = get(url);
                if (statusCode == 200) {
                    success("User Authentication Successful ! You will be redirected ...");
                    if(getUrlParameter("isFaculty") != "true")redirect("/dashboard/student?username="+username);
                    else redirect("/dashboard/faculty?username="+username);
                } else {
                    danger("Username or password is incorrect ! Try Again !");
                }
            }
        }
    });

    $("#registration-form").submit(function (event) {
        event.preventDefault();
        if ($("#inputPassword1").val() !== $("#inputPassword2").val()) {
            warning("Password Mismatch !");
            return;
        } else {
            var data = toJSONString(this);
            var url = window.location.origin;
            if (getUrlParameter("isFaculty") == "true") url += "/faculty/new";
            else url += "/student/new";
            var statusCode = post(url, data);
            switch (statusCode) {
                case 200 :
                    var loginLink = "/login" + "?isFaculty=" + getUrlParameter("isFaculty");
                    success("User Creation Successful ! Click <a href='" + loginLink + "'><b>HERE</b></a> To Continue !");
                    break;
                case 420 :
                    danger("Email already registered ! Try Another One !");
                    break;
            }
        }
    });
});