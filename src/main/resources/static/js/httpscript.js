var statusCode;

function get(url) {
    $.ajax({
        type: "GET",
        url: url,
        headers : header(),
        async : false,
        error: function (jqXHR) {
            statusCode = jqXHR;
        },
        success: function (jqXHR) {
            statusCode = jqXHR;
        }
    });
    return statusCode;
}

function post(url, data) {
    $.ajax({
        type: "POST",
        url: url,
        async : false,
        headers : header(),
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        data: data,
        error: function (jqXHR) {
            statusCode = jqXHR;
        },
        success: function (jqXHR) {
            console.log(jqXHR);
            statusCode = jqXHR;
        }
    });
    return statusCode;
}

function put(url,data) {
    $.ajax({
        type: "PUT",
        url: url,
        headers : header(),
        async : false,
        data: data,
        error: function (jqXHR) {
            console.log("Status Code : " + jqXHR.statusCode + "\nResponse Text : " + jqXHR.responseText);
        },
        success: function (response) {
            return JSON.parse(response);
        }
    });
}

function header() {
    return {
        "X-Tenant-Identifier" : "moses"
    }
}