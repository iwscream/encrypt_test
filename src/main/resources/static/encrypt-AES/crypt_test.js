import crypt from "/crypt.js"


$("#de").click(function () {
    var input = $("#input").val();
    // var de = crypt.decrypt("input");

    // $("div").html(de);
    $.get("http://localhost:8080/decrypt?message=" + input, function (result) {
        $("div").html(result);
    });
});
