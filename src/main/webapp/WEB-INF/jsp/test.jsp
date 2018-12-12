<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
        .card-body {
            padding: 7px !important;
        }
    </style>
</head>
<body>
<script>
    var questionList =  eval('\''+'${testDetail.questionList}'+'\'');
</script>
<div class="navbar navbar-light bg-dark fixed-top" style="color: white;position: sticky;z-index: 100;">
    <a class="navbar-brand">MOCKPRO</a>
    <a class="navbar-brand mx-auto">Time Left : <span id="timer" style="color: red;font-weight: bold;font-size: 26px;"></span></a>
</div>
<div class="container" style="margin-top: 10px;border-style:groove;border-radius: 4px;border-width: 2px;">
    <form method="post" id="test-form">
        <input type="hidden" id="test-id" value=${testDetail.testId}>
        <input type="hidden" id="student-id" value=${testDetail.studentId}>
        <input type="hidden" id="test-duration" value=${testDetail.testDuration}>
        <c:set var="count" value="1" scope="page"/>
        <c:forEach items="${queries}" var="query">
            <div class="card" style="margin: 20px;">
                <div class="card-header">
                    <p>${count}. ${query.description}</p>
                </div>

                <div class="card-body">
                    <div class="input-group">
                        <div class="input-group-prepend">
                            <div class="input-group-text">
                                <input type="radio" value="A" name=${query.questionId}>
                            </div>
                        </div>
                        <lablel class="form-control">${query.firstAnswer}</lablel>
                    </div>
                </div>

                <div class="card-body">
                    <div class="input-group">
                        <div class="input-group-prepend">
                            <div class="input-group-text">
                                <input type="radio" value="B" name=${query.questionId}>
                            </div>
                        </div>
                        <p type="text" class="form-control">${query.secondAnswer}</p>
                    </div>
                </div>

                <div class="card-body">
                    <div class="input-group">
                        <div class="input-group-prepend">
                            <div class="input-group-text">
                                <input type="radio" value="C" name=${query.questionId}>
                            </div>
                        </div>
                        <p type="text" class="form-control">${query.thirdAnswer}</p>
                    </div>
                </div>

                <div class="card-body">
                    <div class="input-group">
                        <div class="input-group-prepend">
                            <div class="input-group-text">
                                <input type="radio" value="D" name=${query.questionId}>
                            </div>
                        </div>
                        <p type="text" class="form-control">${query.fourthAnswer}</p>
                    </div>
                </div>
                <input type="hidden" id=${query.questionId} value=${query.correctAnswer}>
            </div>
            <c:set var="count" value="${count + 1}" scope="page"/>
        </c:forEach>
        <hr>

        <div class="modal fade" id="feedback-modal" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLongTitle">Please Give A Feedback</h5>
                    </div>
                    <div class="modal-body">
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <span class="input-group-text">With textarea</span>
                            </div>
                            <textarea class="form-control" aria-label="With textarea" name="feedback" id="feedback"></textarea>

                            <div class="col-md-12 text-center" style="margin: 10px;">
                                <input type="submit" class="btn btn-success" value="SUBMIT">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </form>
</div>
</body>
<script type="text/javascript" src="/js/testscript.js"></script>
<script type="text/javascript" src="/js/httpscript.js"></script>
</html>