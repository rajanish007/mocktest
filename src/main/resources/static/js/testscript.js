var startTime;
$(document).ready(function () {
    $("#test-form").submit(function (event) {
        event.preventDefault();
        console.log(payload);
        $("#feedback-modal").modal("hide");
        var questions = questionList.split(',');
        var totalScore = questions.length * 10;
        var scored = 0;
        var watcher = [];
        for (var q in questions) {
            var s = 'input[name=' + questions[q] + ']:checked';
            var selectedValue = $(s).val();
            var r_id = '#' + questions[q];
            if ($(r_id).val() == selectedValue) {
                scored += 10;
            }
            watcher[q] = {"questionId": questions[q], "querieResponse": selectedValue}
        }
        scored = (scored / totalScore) * 100;
        var feedback = $("#feedback").val();
        var payload = {
            "testId": $("#test-id").val(),
            "studentId": $("#student-id").val(),
            "percentage": scored.toFixed(2),
            "status": scored >= 30 ? "PASS" : "FAIL",
            "feedback": feedback,
        };
        post(window.location.origin + "/test/watcher", JSON.stringify(watcher));
        post(window.location.origin + "/test/new/result", JSON.stringify(payload));
        window.location.replace(window.location.origin + "/test/result?testId=" + $("#test-id").val());
    });

    startTime = new Date().getTime();
});

var x = setInterval(function () {
    var now = new Date().getTime();

    var diff = (now - startTime);

    if (diff <= $("#test-duration").val() * 1000) {
        document.getElementById("timer").innerHTML = $("#test-duration").val() - Math.round(diff / 1000) + " SEC";
    } else {
        clearInterval(x);
        document.getElementById("timer").innerHTML = "TIME UP";
        $("#feedback-modal").modal({
            backdrop: 'static',
            keyboard: false
        });
    }
}, 1000);