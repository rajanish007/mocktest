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
</head>
<body>
<jsp:include page="header_guest.jsp"/>
<div class="container">
    <div style="border-radius: 5px;border-style:groove;margin-top: 10%;padding: 25px;background-color: #e6e6ff;width: 60%;margin-left: 20%;">
        <form id="registration-form" method="post">
            <div class="form-group">
                <label>Name</label>
                <input type="text" class="form-control" name="studentName" required>
            </div>
            <div class="form-group">
                <label>Username</label>
                <input type="text" class="form-control" aria-describedby="usernameHelp" name="studentUserName" required>
                <small id="usernameHelp" class="form-text text-muted">Maximum 20 characters.</small>
            </div>
            <div class="form-group">
                <label for="inputEmail">Email address</label>
                <input type="email" class="form-control" id="inputEmail" aria-describedby="emailHelp"
                       placeholder="name@example.com" name="studentEmail" required>
                <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.
                </small>
            </div>
            <div class="form-group">
                <label for="inputPassword1">Password</label>
                <input type="password" class="form-control" id="inputPassword1" placeholder="Password"
                       aria-describedby="passwordHelp" name="studentPassword" required>
                <small id="passwordHelp" class="form-text text-muted">Maximum 20 characters.</small>
            </div>
            <div class="form-group">
                <label for="inputPassword2">Password</label>
                <input type="password" class="form-control" id="inputPassword2" placeholder="Retype Password"
                       required>
            </div>
            <div class="text-center">
                <button class="btn btn-success" type="submit">Register</button>
            </div>
        </form>
    </div>
    <jsp:include page="alert.jsp"/>
</div>
</body>
<script type="text/javascript" src="/js/loginscript.js"></script>
<script type="text/javascript" src="/js/httpscript.js"></script>
</html>