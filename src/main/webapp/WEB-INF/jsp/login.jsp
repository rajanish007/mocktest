<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons"
          rel="stylesheet">
    <script
            src="https://code.jquery.com/jquery-3.3.1.min.js"
            integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
            crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"></script>
    <script type="text/javascript" src="js/loginscript.js"></script>
    <script type="text/javascript" src="js/httpscript.js"></script>
</head>
<body>
<jsp:include page="header_guest.jsp"/>
<div class="container">
    <div style="border-radius: 5px;border-style:groove;margin-top: 20%;padding: 25px;background-color: #e6e6ff;width: 60%;margin-left: 20%;">
        <form id="login-form" method="get" action="">
            <div class="form-group">
                <label for="inputUsername">Username/Email</label>
                <input type="text" class="form-control" id="inputUsername" aria-describedby="usernameHelp"
                       placeholder="john123" required>
            </div>
            <div class="form-group">
                <label for="inputPassword">Password</label>
                <input type="password" class="form-control" id="inputPassword" placeholder="Password" required>
            </div>
            <label><a href="/login/new/student">Not a user ? Register !</a></label>
            <div class="text-center">
                <button class="btn btn-success" id="login_button" type="submit">Proceed</button>
            </div>
        </form>
    </div>
    <jsp:include page="alert.jsp"/>
</div>
<input type="hidden" id="context-path" value=${request.contextPath}>
</body>
</html>