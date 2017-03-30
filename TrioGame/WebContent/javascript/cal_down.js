$(document).ready(function(){
	$.ajax({
		type: "POST",
		url: "downCount.php",
		data: "type=search",
		success: function(result){
			var count=result.split("&&&");
			var count1=parseInt(count[1])+35800;
			var count3=parseInt(count[3])+18600;
			$('#downexe_day_count').text(count[0]);
			$('#downexe_totalcount').text(count1);
			$('#downzip_day_count').text(count[2]);
			$('#downzip_totalcount').text(count3);
		}
	});
	$('#downexe').click(function(){
		cal_down('downexe');
	});
	$('#downzip').click(function(){
		cal_down('downzip');
	});
});
function cal_down(type){
	var d=new Date();
	var time=d.getTime();
	jQuery.ajax({
		type: "POST",
		url: "downCount.php",
		data: "type="+type+"&time="+time,
		success: function(result){
		}
	});
}