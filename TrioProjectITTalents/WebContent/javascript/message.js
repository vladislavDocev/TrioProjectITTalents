// JavaScript Document
/*$(document).ready(function(){
	$('#postmessage').click(function(){
		
	});
});*/
function replay(messageid){
	
	$.ajax({
		type: "POST",
		url: "message.php",
		data: "action=replay&messageid="+messageid,
		success: function(result){
			if(result.indexOf(1) != -1){
				alert('ok');
			}
		}
	});
}