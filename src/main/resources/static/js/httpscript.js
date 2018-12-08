var statusCode;

function get(url) {
    $.ajax({
        type: "GET",
        url: url,
        headers : header(),
        async : false,
        error: function (data, statusText, xhr) {
            statusCode = xhr.status;
        },
        success: function (data, statusText, xhr) {
            statusCode = xhr.status;
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
        error: function (data, statusText, xhr) {
            statusCode = data.status;
        },
        success: function (data, statusText, xhr) {
            statusCode = data.status;
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