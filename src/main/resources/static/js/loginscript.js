$(document).ready(function () {
    $("#registration-link").attr("href",
        $("#registration-link").val() + "/login/new?isFaculty=" + getUrlParameter("isFaculty"));

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

function toJSONString(form) {
    var obj = {};
    var elements = form.querySelectorAll("input, select, textarea");
    for (var i = 0; i < elements.length; ++i) {
        var element = elements[i];
        var name = element.name;
        var value = element.value;

        if (name) {
            obj[name] = value;
        }
    }
    return JSON.stringify(obj);
}

function getUrlParameter(sParam) {
    var sPageURL = window.location.search.substring(1),
        sURLVariables = sPageURL.split('&'),
        sParameterName,
        i;

    for (i = 0; i < sURLVariables.length; i++) {
        sParameterName = sURLVariables[i].split('=');

        if (sParameterName[0] === sParam) {
            return sParameterName[1] === undefined ? true : decodeURIComponent(sParameterName[1]);
        }
    }
}

function redirect(endpoint) {
    window.location.replace(window.location.origin + endpoint);
}