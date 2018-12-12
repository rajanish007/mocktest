<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
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
<jsp:include page="new_querie_modal.jsp"/>
<jsp:include page="alert.jsp"/>
<div class="container">
    <div class="card" style="margin-top: 10px;">
        <img class="card-img-top" src="/img/mcq.jpg" alt="Card image cap" style="height: 30vh;">
        <div class="card-body">
            <div class="row">
                <div class="col-md-6">
                    <h4 class="card-title"><b>Hi, ${faculty_profile.facultyName} !</b></h4>
                    <h5 class="card-text">Username : ${faculty_profile.facultyUserName}</h5>
                    <h5 class="card-text">Email : ${faculty_profile.facultyEmail}</h5>
                    <h5 class="card-text" id="faculty-id">ID : ${faculty_profile.facultyId}</h5>
                </div>
                <div class="col-md-6 text-right">
                    <img src="/img/fac.jpg" style="width: 100px;height: 100px;">
                </div>
            </div>
            <hr class="my-4">
        </div>
        <div>
            <h3 class="text-center"><b>QUESTIONS ARCHIVE</b>
                <i class="material-icons" style="float: right;font-size: 60px;color:green;cursor: pointer;"
                   data-toggle="modal" data-target="#exampleModalCenter">add_circle</i>
            </h3>
            <hr class="my-4">
            <table class="table table-striped">
                <thead>
                <tr>
                    <th scope="col">Q_ID</th>
                    <th scope="col">Time</th>
                    <th scope="col">Querie</th>
                    <th scope="col">A</th>
                    <th scope="col">B</th>
                    <th scope="col">C</th>
                    <th scope="col">D</th>
                    <th scope="col">Ans</th>
                </tr>
                </thead>
                <tbody>
                    <c:forEach items="${qList}" var="query">
                        <tr>
                            <td>${query.questionId}</td>
                            <td>${query.timeAllocated}</td>
                            <td>${query.description}</td>
                            <td>${query.firstAnswer}</td>
                            <td>${query.secondAnswer}</td>
                            <td>${query.thirdAnswer}</td>
                            <td>${query.fourthAnswer}</td>
                            <td>${query.correctAnswer}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
<script type="text/javascript" src="/js/httpscript.js"></script>
<script type="text/javascript" src="/js/fdashboardscript.js"></script>
</html>