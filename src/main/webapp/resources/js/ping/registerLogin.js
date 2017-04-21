$(document).ready(function() {
	alreadyRead();
});

//確認是否閱讀條款
function alreadyRead() {
	$("#alreadyRead").change(function() {
		boolean = $("#alreadyRead").prop("checked");
		if(boolean) {
			$("fieldset").removeAttr("disabled");
		} else {
			$("fieldset").attr("disabled","disabled");
		}
	});
}

function loginCheck() {
	$.ajax({
		type:"post",
		data:$("#loginForm").serialize(),
		url:"registerLogin/login",
		success:function(result) {
			if (result == "true") {
				$("#loginForm").submit();
			} else {
			}
		}
	});
}