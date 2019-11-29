<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<meta charset="utf-8" />
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<title>NO2</title>
<link href="css/Diy_DiyZj.css" rel="stylesheet">
<link href="css/Diy_ProList.css" rel="stylesheet">
<link href="css/Diy_HardwareList.css" rel="stylesheet">

	<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
	<script type="text/javascript" src="js/HardwarePage.js"></script>

<style>
* {
	margin: 0;
	padding: 0;
}

button, input {
	outline: none;
}

button {
	border: 1px solid;
	border-radius: 6px;
}

#close {
	position: relative;
	left: 580px;
	top: 5px;
	font-size: 20px;
}

.login {
	width: 120px;
	height: 42px;
	background: rgb(55, 145, 237);
	color: #fff;
	border: none;
	border-radius: 6px;
	display: block;
	margin: 20px auto;
	cursor: pointer;
	
}

.popOutBg {
	width: 100%;
	height: 100%;
	position: fixed;
	left: 0;
	top: 0;
	background: rgba(0, 0, 0, .6);
	display: none;
	z-index:999;
}

.popOut {
	position: fixed;
	width: 600px;
	height: 300px;
	top: 50%;
	left: 50%;
	margin-top: -150px;
	margin-left: -300px;
	background: #fff;
	border-radius: 8px;
	overflow: hidden;
	display: none;
	z-index:999;
	position: fixed;
}

.popOut>span {
	position: absolute;
	right: 10px;
	top: 0;
	height: 42px;
	line-height: 42px;
	color: #000;
	font-size: 30px;
	cursor: pointer;
}

.popOut table {
	display: block;
	margin: 42px auto 0;
	width: 520px;
}

.popOut caption {
	width: 520px;
	text-align: center;
	color: rgb(55, 145, 237);
	font-size: 18px;
	line-height: 42px;
}

.popOut table tr td {
	color: #666;
	padding: 6px;
	font-size: 14px;
}

.popOut table tr td:first-child {
	text-align: right;
}

.inp {
	width: 280px;
	height: 30px;
	line-height: 30px;
	border: 1px solid #999;
	padding: 5px 10px;
	color: #000;
	font-size: 14px;
	border-radius: 6px;
}

.inp:focus {
	border-color: rgb(55, 145, 237);
}

@
keyframes ani {from { transform:translateX(-100%)rotate(-60deg)scale(.5);
	
}

50%{
transform
:translateX(0)

rotate

(0)
scale
(1);
}
90%{
transform

:translateX(20px)

rotate


(0)
scale




(
.8




);
}
to {
	transform: translateX(0) rotate(0) scale(1);
}

}
.ani {
	animation: ani .5s ease-in-out;
}

#wxzj {
	position: fixed;
	right: 10px;
	top: 300px;
	width: 80px;
	text-align: center;
	_position: absolute;
	font: 14px/18px 'Microsoft YaHei';
	color: #333;
}

#wxzj p {
	margin-top: 5px;
	text-indent: 20px;
	background: url(https://icon.zol-img.com.cn/zj/qr-icon2017.gif) 8px 0
		no-repeat;
}

#wxzj .wxzj-close {
	float: right;
	width: 13px;
	height: 13px;
	background: #fff url(https://icon.zol-img.com.cn/zj/icons2017.gif)
		no-repeat;
	cursor: pointer;
	border: 1px solid #CBCBCB;
}

#wxzj .wxzj-close:hover {
	background-position: 0 -14px;
	border: 1px solid #008DE1;
}

.pub-element {
	position: fixed;
	bottom: 10px;
	right: 10px;
	_position: absolute;
	_bottom: auto;
	_top: expression(eval(document.documentElement.scrollTop + 
		 document.documentElement.clientHeight-277));
}

.pub-element a {
	display: block;
	margin: 1px 0 0;
	width: 60px;
	height: 60px;
	opacity: 0.6;
	filter: alpha(opacity = 60);
	background-color: #3382d5;
}

.pub-element a:hover {
	opacity: 1;
	filter: alpha(opacity = 100);
	color: #fff;
	text-decoration: none;
}

.pub-element .pub-scrolltop {
	background:
		url(https://icon.zol-img.com.cn/mouse/140716/top-btn-ico.png)
		no-repeat;
	background-color: #3382d5;
	text-indent: -9999em;
	overflow: hidden;
}

.pub-element .pub-feedback {
	padding: 13px 10px 0 16px;
	width: 34px;
	height: 47px;
	font: 14px/16px "Microsoft YaHei", "\5FAE\8F6F\96C5\9ED1";
	color: #fff;
}

.header-links i.icon-made {
	background: url('https://icon.zol-img.com.cn/channel/ico-made.png')
		no-repeat;
	margin: 4px 3px 0 0;
}

.active {
	background-color: #307bca;
	text-decoration: none;
}
</style>

</head>
<body>
	<div class="nav-search" style="margin-left: 400px;">
		<div class="navs-box clearfix">
			<span class="zol20th"></span>
			<div class="inf">
				<ul class="list clearfix">

					<li class="li5">
						<div class="search-box">
							<input id="J_keywords" type="text" class="skey" name="kword"
								placeholder="请输入关键词或配置单名称" data-source="" autocomplete="off">
							<!--<input type="hidden" name="f" value="c">-->
							<input id="submit" type="button" class="sbtn" onclick="scan()"
								value="搜索">
						</div>
					</li>
				</ul>
			</div>
		</div>
	</div>

	<!--顶部-->
	<div class="nav">
		<div class="nav-box">
			<ul class="navul" style="min-width: 800px; margin-left: 150px;">

				<li id="menu_nav_index"><a class="active">模拟攒机</a></li>
				<li id="menu_nav_myplan"><a target="_self"
					href="front/myplan.jsp">我的方案</a></li>
				<li id="menu_nav_wyplan"><a target="_self"
					href="front/netplan.jsp">网友方案</a></li>
				<li id="menu_nav_DiyTop"><a target="_self" href="">配置排行榜</a></li>
				<li id="menu_nav_ProTop"><a target="_self"
					href="front/rank.html">网友首选配件</a></li>
				<li id="menu_nav_Smart"><a target="_blank" href="">智能推荐攒机</a></li>
			</ul>
		</div>
	</div>

	<!-- 配件类型选择栏 -->
	<div class="parts wrapper">
	
	<br />
	<br />
	<br />

	<%
		session.setMaxInactiveInterval(10);
	%>
	<!-- 配置单栏 -->
	<div class="wrapper clearfix">
		<div class="zj-parts">
			<!-- zj-parts have -->
			<div class="zj-parts-head">装机配置单</div>
			<div class="zj-login" style="display: block">
				您还未登录，登录后才能预览和发表配置。
				<button type="button" class="login-btn" id="btn1"
					onclick="showlogin()">登录</button>
			</div>
			<div class="zj-login"
				style="display: none; color: rgb(55, 145, 237); font-size: 20px;">
				<strong id="my">${currentAdmin.uname }</strong>,欢迎你。
			</div>
			<!-- <div class="zj-login">当前账号：<a href="javascript:;" target="_self" class="blue">al1wix</a> | <a href="javascript:;" target="_self">退出</a></div> -->
			<ul>
				<li id="leftSubSel_28" rel="28" class="active">
					<h3>
						CPU<i>*</i>
					</h3> <span class="pic"></span>
					<div class="zj-parts-con">请选择商品</div> <span class="link-add" onclick="cpuPage()">添加</span>
					<span class="delete"></span>
				</li>
				<li id="leftSubSel_5" rel="5">
					<h3>
						主板<i>*</i>
					</h3> <span class="pic"></span>
					<div class="zj-parts-con">请选择商品</div> <span class="link-add" onclick="boardPage()">添加</span>
					<span class="delete"></span>
				</li>
				<li id="leftSubSel_3" rel="3">
					<h3>
						内存<i>*</i>
					</h3> <span class="pic"></span> <span class="zj-parts-con">请选择商品</span>
					<span class="link-add" onclick="memoryPage()">添加</span> <span class="delete"></span>
				</li>
				<li id="leftSubSel_2" rel="2">
					<h3>硬盘</h3> <span class="pic"></span> <span class="zj-parts-con">请选择商品</span>
					<span class="link-add" onclick="diskPage()">添加</span> <span class="delete"></span>
				</li>
				<li id="leftSubSel_6" rel="6">
					<h3>显卡</h3> <span class="pic"></span> <span class="zj-parts-con">请选择商品</span>
					<span class="link-add" onclick="graphicsPage()">添加</span> <span class="delete"></span>
				</li>
				<li id="leftSubSel_10" rel="10">
					<h3>机箱</h3> <span class="pic"></span> <span class="zj-parts-con">请选择商品</span>
					<span class="link-add" onclick="boxPage()">添加</span> <span class="delete"></span>
				</li>
				<li id="leftSubSel_35" rel="35">
					<h3>电源</h3> <span class="pic"></span> <span class="zj-parts-con">请选择商品</span>
					<span class="link-add" onclick="sourcePage()">添加</span> <span class="delete"></span>
				</li>

				<li class="total">
					<h3>共计0项</h3> <span>合计 <em>￥0</em></span>
				</li>
			</ul>


			<!-- 其他信息栏 -->
			<div class="other-msg">

				<div class="item mingcheng">
					<p class="lable">
						<em id="name-str-count">0/20</em><b>名称：<font>*</font></b> （为了避免重复请输入大于6个汉字/字符) <span class="inst">名称6到20个字才能发布</span>
					</p>
					<input type="text" class="name " value="" oninput="countStr(this, 20, 'name-str-count')">
				</div>
				<div class="item shuoming">
					<p class="lable">
						<em id="info-str-count">0/200</em><b>说明：</b><span class="inst">内容不可超过120字</span>
					</p>
					<textarea class="instruct "
						placeholder="您攒机的目的/预算，该配置的优势，分享更多内容，获取更多关注"  oninput="countStr(this, 120, 'info-str-count')"></textarea>
				</div>
				<div class="item clearfix">
					<p class="lable code-msg">
						<b>验证码：</b><span class="inst">请正确填写验证码</span>
					</p>
					<div class="code-box">
						<input type="text" class="code "> 
						<span class="code-img">
							&nbsp;&nbsp; 
							<a target="_self" class="blue" onclick="createCode()" id="checkCode" style="display: inline-block"></a> 
							<span>点击图片刷新</span>
						</span>
					</div>
				</div>

			</div>
			<div class="btn-box">
				<a href="javascript:void(0);" target="_self" class="publish" onclick="addComputer(cpuid, motherboardid, memoryid, diskid, sourceid, graphicsid, boxid);">发表配置单</a>
				<a href="javascript:void(0);" target="_self" class="empty">清空</a>
			</div>
		</div>

	<div class="conditions"> 
	   <!--list-title end--> 
	   
		<!--  -->
	</div>



	<script type="text/javascript">
		var cpuid;
		var motherboardid;
		var memoryid;
		var diskid;
		var sourceid;
		var graphicsid;
		var boxid;
	
		var page = 1;
		var showRows = 6;
	
		var hardware;
	
		var vcode;
		var vcodePath;


		window.onload = function() {

			var str = $("#my").html();

			if (str != null && str.length > 0 && "" != str) {

				$(".popOut").css('display', 'none');
				$(".popOutBg").css('display', 'none');
				$(".zj-login:eq(0)").css('display', 'none');
				$(".zj-login:eq(1)").css('display', 'block');
			}
			createCode();
			cpuPage();
			};


		function createCode() {
			
			$.post("vcode", function(data) {
				vcode = data.code;
				console.log(vcode);
				fileName = data.filename;
				console.log(fileName);

				$("#checkCode").css("width", "90px");
				$("#checkCode").css("height", "20px");
				$("#checkCode").css("background-image",
						"url('../vcode/" + fileName + ".jpg')");

			}, "json");
		}

		function login1() {

			var uname = $.trim($("#uname").val());
			var upwd = $.trim($("#upwd").val());

			if (uname == "") {
				alert("请输入手机号或邮箱地址...");
				return;
			}

			if (upwd == "") {
				alert("请输入密码...");
				return;
			}
			$.post("usr", {
				op : "login",
				uname : uname,
				upwd : upwd
			}, function(data) {
				data = parseInt($.trim(data));

				if (data == 1) {
					$(".popOut").css('display', 'none');
					$(".popOutBg").css('display', 'none');
					$(".zj-login:eq(0)").css('display', 'none');
					$(".zj-login:eq(1)").css('display', 'block');
					window.location.reload();

				} else {
					alert("账号或密码错误，请重新登陆！")
				}
			}, "text")
		}
		function showlogin() {
			$("#pop1").css('display', 'block');
			$("#pop2").css('display', 'block');
		}
		function close() {
			$("#pop1").css('display', 'none');
			$("#pop2").css('display', 'none');
		}
		function scan() {
			var ss = $("#J_keywords").val();
			console.log(ss);
		}
		
		//字数监听
		function countStr(obj, maxStr, id) {
			var count = $(obj).val().length;
			if (count <= maxStr) {
				$("#" + id).css('color', 'black');
				$("#" + id).html(count + "/" + maxStr);
			} else {
				$("#" + id).css('color', 'red');
				$("#" + id).html(count + "/" + maxStr);
			}

		}
		
		//提交配置单
		function addComputer(cpu, motherboard, memory, disk, source, graphics, box) {
			if (cpu == null || motherboard == null || memory ==null) {
				alert("CPU,主板和内存为必选硬件，请检查您的配置单！");
				return;
			}
			var inputCode = $(".code").val();
			
			if (inputCode != vcode) { alert("验证码错误，请重新输入！"); return;}
		}
		
	</script>

</body>
</html>

	<div class="popOutBg" id="pop1" style="display: none;"></div>
	<div class="popOut" id="pop2" style="display: none;">
		<a title="关闭" id="close" href="javascript:close()"> x </a>
		<table>
			<caption>欢迎登录本网站</caption>
			<a href="front/register.html" class="freeret">免费注册<font>&gt;&gt;</font></a>
			<tr>
				<td width="120">用户名：</td>
				<td><input type="text" class="inp" id="uname"
					placeholder="请输入用户名或邮箱地址" /></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" class="inp" id="upwd"
					placeholder="请输入密码" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="button" class="login" value="登录" onclick="login1()" /></td>
				<a href="front/forgetPwd.html" class="forgetpsw">忘记密码?</a>
			</tr>
		</table>
	</div>

