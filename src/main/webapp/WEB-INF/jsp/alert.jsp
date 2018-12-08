<div class="alert alert-warning" role="alert" style="margin-top: 10px;display:none;" id="warning-alert">
</div>
<div class="alert alert-success" id="success-alert" role="alert" style="display: none;margin-top: 10px;">
</div>
<div class="alert alert-danger" id="danger-alert" role="alert" style="display: none;margin-top: 10px;">
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
</script>