<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>MCQ</title>
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
<body style="background-color:  #ccccff">
<jsp:include page="header_guest.jsp"/>
<div class="jumbotron">
    <h1 class="display-4">MOCKPRO</h1>
    <p class="lead">Practice anything. Learn everything. Create your own.</p>
    <hr class="my-4">
    <p>MockPro is platform for students, where they can practice their skills. Questions are managed by
        faculties.
        <br> Our Machine selects random set of questions
        based on skillset and previous test performance by student. Register today to begin !
    </p>
</div>

<div class="container-fluid text-center">
    <h2><b>RANKER's BOARD</b></h2>
    <table class="table table-dark table-striped">
        <thead>
        <tr>
            <th scope="col">Rank</th>
            <th scope="col">NAME</th>
            <th scope="col">Uername</th>
            <th scope="col">Score</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${ranking}" var="rank">
            <tr>
                <td>#${rank.rank}</td>
                <td>${rank.name}</td>
                <td>${rank.username}</td>
                <td>${rank.score} %</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>