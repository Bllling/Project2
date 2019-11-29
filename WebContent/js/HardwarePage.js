/*"*
 * 
 */

function cpuPage() {
	$(".conditions").html("");
	$(".conditions").load("pages/cpupage.html");
}



function boardPage() {
	$(".conditions").html("");
	$(".conditions").load("pages/boardpage.html");
	var type = $("#HardWareType").val();
	console.log(type);
}

function memoryPage() {
	$(".conditions").html("");
	$(".conditions").load("pages/memorypage.html");
}

function diskPage() {
	$(".conditions").html("");
	$(".conditions").load("pages/diskpage.html");
}

function sourcePage() {
	$(".conditions").html("");
	$(".conditions").load("pages/sourcepage.html");
}

function graphicsPage() {
	$(".conditions").html("");
	$(".conditions").load("pages/graphicspage.html");
}

function boxPage() {
	$(".conditions").html("");
	$(".conditions").load("pages/boxpage.html");
}
