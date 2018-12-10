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
<jsp:include page="header.jsp"/>
<div class="container">
    <div class="card" style="margin-top: 10px;">
        <img class="card-img-top" src="/img/mcq.jpg" alt="Card image cap" style="height: 30vh;">
        <div class="card-body">
            <div class="row">
                <div class="col-md-6">
                    <h4 class="card-title"><b>Hi, ${student_profile.studentName} !</b></h4>
                    <h5 class="card-text">Username : ${student_profile.studentUserName}</h5>
                    <h5 class="card-text">Email : ${student_profile.studentEmail}</h5>
                    <h5 class="card-text">ID : ${student_profile.studentId}</h5>
                </div>
                <div class="col-md-6 text-right">
                    <img src="/img/stud.png" style="width: 100px;height: 100px;">
                </div>
            </div>
            <hr class="my-4">
            <div class="text-center">
                <a href="#" class="btn btn-success" style="width: 30%;height: 30%;">BEGIN NEW TEST</a>
            </div>
        </div>
    </div>
</div>
</body>
</html>