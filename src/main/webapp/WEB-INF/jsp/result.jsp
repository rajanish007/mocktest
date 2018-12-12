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
    <style type="text/css">
    </style>
</head>
<body>
<div class="container">
    <div class="row" style="border-style: groove;border-radius: 5px;margin-top: 10%;background-color:  #ccccff">
        <div class="col-md-12 text-center" style="margin-top: 10px;">
            <div class="alert alert-info" role="alert">
                You Answered <h5><b>${result.percentage}%</b></h5> Questions CORRECT !<br>
                Result : ${result.status}
            </div>
            <div class="alert alert-success" role="alert">
                <h3><b>Your Response Is Recorded !<br> Thanks for Taking Test !</b></h3>
            </div>
        </div>
        <div class="col-md-12 text-center">
            <a href="/">
                <button style="margin: 20px;" class="btn btn-success">EXIT</button>
            </a>
        </div>
    </div>
</div>
</body>
</html>