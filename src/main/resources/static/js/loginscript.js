$(document).ready(function () {
    $("#register-button").click(function () {
        get("/login/new/student");
    });

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
            var url = $("#context-path").val() + "login/check?username=" + username + "&password=" + password;
            if (username != "" && password != "") {
                var statusCode = get(url);
                if (statusCode == 200) {
                    success("User Authentication Successful ! You will be redirected ...");
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
            var url = $("#context-path").val() + "/student/new";
            var statusCode = post(url, data);
            switch (statusCode) {
                case 200 :
                    success("User Creation Successful ! Click <a href='/login'><b>HERE</b></a> To Continue !");
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