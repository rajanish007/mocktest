<div class="alert alert-warning" role="alert" style="margin-top: 10px;display:none;" id="warning-alert">
</div>
<div class="alert alert-success" id="success-alert" role="alert" style="display: none;margin-top: 10px;">
</div>
<div class="alert alert-danger" id="danger-alert" role="alert" style="display: none;margin-top: 10px;">
</div>

<div class="alert alert-success alert-dismissible fade show" role="alert" id="pop-success-alert" style="display: none;">
    <strong>Success !</strong> Entry Successful !
    <button type="button" class="close" data-dismiss="alert" aria-label="Close">
        <span aria-hidden="true">&times;</span>
    </button>
</div>

<div class="alert alert-warning alert-dismissible fade show" role="alert" id="pop-warning-alert" style="display: none;">
    <strong>Warning !</strong> Something is not right !
    <button type="button" class="close" data-dismiss="alert" aria-label="Close">
        <span aria-hidden="true">&times;</span>
    </button>
</div>

<div class="alert alert-danger alert-dismissible fade show" role="alert" id="pop-danger-alert" style="display: none;">
    <strong>Warning !</strong> Something Went Wrong !
    <button type="button" class="close" data-dismiss="alert" aria-label="Close">
        <span aria-hidden="true">&times;</span>
    </button>
</div>

<script type="text/javascript">
    function warning(message) {
        $(".alert").hide();
        $("#warning-alert").html(message).show();
    }

    function success(message) {
        $(".alert").hide();
        $("#success-alert").html(message).show();
    }

    function danger(message) {
        $(".alert").hide();
        $("#danger-alert").html(message).show();
    }

    function warning_alert() {
        $(".alert").hide();
        $("#pop-warning-alert").show().alert();
    }

    function success_alert() {
        $(".alert").hide();
        $("#pop-success-alert").show().alert();
    }

    function danger_alert() {
        $(".alert").hide();
        $("#pop-danger-alert").show().alert();
    }
</script>