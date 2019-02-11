$(document).ready(function () {

    $("#new-querie-form").submit(function (event) {
        event.preventDefault();
        var url = window.location.origin + "/querie/new"
        var payload = toJSONString(this);
        var statusCode = post(url, payload);
        if (statusCode == 200) success_alert("Query Creation Successful !");
        else danger_alert("Query Creation FAILED !");
        $('#exampleModalCenter').modal('hide');
        window.location.reload();
    });

    $("#querie_table").on('click', '.btn-del', function () {
        if (confirm("You can't redo this operation, continue ?")) {
            var url = window.location.origin + "/querie/delete?qid=" + $(this).closest("tr").find(".qid").text();
            get(url);
            $(this).closest('tr').remove();
        }
    });

    prepareChart();
});

function prepareChart() {
    var chartData;

    $.ajax({
        type: "GET",
        url: window.location.origin + "/dashboard/faculty/queries?username=" + getUrlParameter("username"),
        headers: header(),
        async: false,
        success: function (data, statusText, xhr) {
            chartData = data;
        }
    });
    var labels = [];
    var easyData = [];
    var averageData = [];
    var hardData = [];
    var e = 0, a = 0, h = 0;
    for (var i in chartData) {
        labels.push(chartData[i].questionId);
        var per = Math.round((chartData[i].correctAttempts / chartData[i].totalAttempts) * 100);
        if (per <= 40) {
            h++;
        } else if (per >= 70) {
            e++;
        } else {
            a++;
        }
    }
    hardData.push(h);
    easyData.push(e);
    averageData.push(a);
    var datasets = [{
        label: 'Easy',
        backgroundColor: "#5BFF33",
        borderWidth: 1,
        data: easyData
    }, {
        label: 'Average',
        backgroundColor: "#FFD433",
        borderWidth: 1,
        data: averageData
    }, {
        label: 'Hard',
        backgroundColor: "#FF3333",
        borderWidth: 1,
        data: hardData
    }];

    var barChartData = {
        label: labels,
        datasets: datasets
    };

    var ctx = document.getElementById('canvas').getContext('2d');
    window.myBar = new Chart(ctx, {
        type: 'bar',
        data: barChartData,
        options: {
            scales: {
                yAxes: [{
                    scaleLabel: {
                        display: true,
                        labelString: 'Question Count'
                    },
                    ticks: {
                        beginAtZero: true,
                        callback: function (value) {
                            if (value % 1 === 0) {
                                return value;
                            }
                        }
                    }
                }],
                xAxes: [{
                    scaleLabel: {
                        display: true,
                        labelString: 'Types'
                    }
                }]
            },
            responsive: true,
            legend: {
                position: 'top',
            },
            title: {
                display: true,
                text: 'Question Difficulty Bar Chart Based On Student Success Rate !'
            }
        }
    });
}