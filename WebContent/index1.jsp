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


		<div class="parts-head">
			<h3>请选择配件</h3>
			<i>*</i> 号为必选项
		</div>
		<ul class="parts-list clearfix">
			<li class="more active"><span>CPU <i>*</i></span>
				<ul>
					<li id="topSubSel_383" rel="383" relnum="2"><span>服务器CPU</span></li>
					<li id="topSubSel_28" rel="28" relnum="2"><span>CPU</span></li>
				</ul></li>
			<li id="topSubSel_5" rel="5" class="cur" relnum="1"><span>主板<i>*</i></span></li>
			<li id="topSubSel_3" rel="3" relnum="8"><span>内存<i>*</i></span></li>
			<li id="topSubSel_2" rel="2" relnum="4"><span>硬盘</span></li>
			<li id="topSubSel_6" rel="6" relnum="4"><span>显卡</span></li>
			<li id="topSubSel_10" rel="10" relnum="1"><span>机箱</span></li>
			<li id="topSubSel_35" rel="35" relnum="1"><span>电源</span></li>
		</ul>
	</div>



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
						<em>0/20</em><b>名称：<font>*</font></b> （为了避免重复请输入大于6个汉字/字符) <span
							class="inst">名称6到20个字才能发布</span>
					</p>
					<input type="text" class="name " value="" date-n="20">
				</div>
				<div class="item shuoming">
					<p class="lable">
						<em>0/200</em><b>说明：</b><span class="inst">内容不可超过120字</span>
					</p>
					<textarea class="instruct "
						placeholder="您攒机的目的/预算，该配置的优势，分享更多内容，获取更多关注" date-n="200"></textarea>
				</div>
				<div class="item clearfix">
					<p class="lable code-msg">
						<b>验证码：</b><span class="inst">请正确填写验证码</span>
					</p>
					<div class="code-box">
						<input type="text" class="code "> <span class="code-img">
							&nbsp;&nbsp; <a href="javascript:void(0);" target="_self"
							class="blue" onclick="createCode()" id="checkCode"
							style="display: inline-block"></a> <span>点击图片刷新</span>
						</span>
					</div>
					<div class="synch" style="display: none;">
						<img /> <input type="checkbox" class="check" id="idToBBs"
							value=""> <span class="instr">同步至论坛让大家点评</span>
					</div>
				</div>

			</div>
			<div class="btn-box">
				<a href="javascript:void(0);" target="_self" class="publish">发表配置单</a><span
					class="preview">预览</span><a href="javascript:void(0);"
					target="_self" class="empty">清空</a>
			</div>
		</div>


		<!-- 右侧筛选栏 -->
<<<<<<< HEAD
		<div class="conditions">
			<div class="list-title">
				<div class="search-box">
					<input type="text" value="请输入品牌或型号" /> <i></i>
				</div>
			</div>
			<!--list-title end-->
		
			<div id="J_ManuFilter" class="filter-brand filter-brand-multi">
				<strong class="filter-type">推荐品牌：</strong>
				<div id="J_ParamBrand" class="brand-hot brand-list"
					style="display: block;">
					<span class="all active" reldate="0">不限</span> <a
						href="javascript:void(0);" target="_self" class="intel"
						relen="intel" reldate="125">Intel</a> <a
						href="javascript:void(0);" target="_self" class="amd" relen="amd"
						reldate="55">AMD</a>
				</div>
				<div class="brand-all" style="display: none;">
					<ul id="J_BrandTab" class="brand-all-tab">
						<li class="active" data-letter-value="all"><span>全部品牌</span><i></i></li>
						<li data-letter-value="0-9"><span>0-9</span><i></i></li>
						<li data-letter-value="65-71"><span>A-G</span><i></i></li>
						<li data-letter-value="72-78"><span>H-N</span><i></i></li>
						<li data-letter-value="79-84"><span>O-T</span><i></i></li>
						<li data-letter-value="85-90"><span>U-Z</span><i></i></li>
					</ul>
				</div>
			</div>
			<div id="priceItem" class="filter-item filter-price">
				<strong class="filter-type">价格区间：</strong>
				<div id="J_ParamPrice" class="param-value-list">
					<span reldate="noPrice" class="all active">不限</span> <a
						href="javascript:void(0);" target="_self" reldate="0">500元以下</a> <a
						href="javascript:void(0);" target="_self" reldate="500">500-1499元</a>
					<a href="javascript:void(0);" target="_self" reldate="1500">1500元以上</a>
				</div>
				<div class="price-self">
					<input id="minPrice" type="text" /> <em>-</em> <input
						id="maxPrice" type="text" /> <span id="subPri"
						class="price-button">确定</span>
				</div>
			</div>
			<div id="pamItem1" class="filter-item">
				<strong class="filter-type">CPU系列：</strong>
				<div id="J_ParamItem1" class="param-value-list">
					<span class="all active" reldate="0">不限</span> <a
						href="javascript:void(0);" target="_self" reldate="s8179">Intel</a>
					<em class="khl">（</em> <a href="javascript:void(0);" target="_self"
						reldate="s7313">酷睿i9</a> <a href="javascript:void(0);"
						target="_self" reldate="s1584">酷睿i7</a> <a
						href="javascript:void(0);" target="_self" reldate="s1079">酷睿i5</a>
					<a href="javascript:void(0);" target="_self" reldate="s1739">酷睿i3</a>
					<a href="javascript:void(0);" target="_self" reldate="s727">奔腾</a>
					<a href="javascript:void(0);" target="_self" reldate="s7280">赛扬</a>
					<a href="javascript:void(0);" target="_self" reldate="s8208">Xeon
						W</a> <a href="javascript:void(0);" target="_self" reldate="s8209">Xeon
						E</a> <em class="khr">）</em> <a href="javascript:void(0);"
						target="_self" reldate="s8180">AMD</a> <em class="khl">（</em> <a
						href="javascript:void(0);" target="_self" reldate="s7329">Ryzen
						Threadripper</a> <a href="javascript:void(0);" target="_self"
						reldate="s8259">Ryzen 9</a> <a href="javascript:void(0);"
						target="_self" reldate="s7274">Ryzen 7</a> <a
						href="javascript:void(0);" target="_self" reldate="s7275">Ryzen
						5</a> <a href="javascript:void(0);" target="_self" reldate="s7328">Ryzen
						3</a> <a href="javascript:void(0);" target="_self" reldate="s4269">APU
					</a> <a href="javascript:void(0);" target="_self" reldate="s3734">推土机FX</a>
					<em class="khr">）</em>
				</div>
				<a class="J_ViewMore view-more" data-target="J_ParamItem4"
					href="javascript:;" target="_self" data-on="0">更多<i></i></a>
			</div>
			<div id="pamItem2" class="filter-item">
				<strong class="filter-type">插槽类型：</strong>
				<div id="J_ParamItem2" class="param-value-list">
					<span class="all active" reldate="0">不限</span> <a
						href="javascript:void(0);" target="_self" reldate="s8125">Intel</a>
					<em class="khl">（</em> <a href="javascript:void(0);" target="_self"
						reldate="s7314">LGA 2066</a> <a href="javascript:void(0);"
						target="_self" reldate="s6810">LGA 2011-v3</a> <a
						href="javascript:void(0);" target="_self" reldate="s6811">LGA
						2011</a> <a href="javascript:void(0);" target="_self" reldate="s6814">LGA
						1151</a> <a href="javascript:void(0);" target="_self" reldate="s6815">LGA
						1150</a> <a href="javascript:void(0);" target="_self" reldate="s6813">LGA
						1155</a> <a href="javascript:void(0);" target="_self" reldate="s6812">LGA
						1170</a> <a href="javascript:void(0);" target="_self" reldate="s6821">LGA
						775</a> <a href="javascript:void(0);" target="_self" reldate="s6822">BGA</a>
					<em class="khr">）</em> <a href="javascript:void(0);" target="_self"
						reldate="s8126">AMD</a> <em class="khl">（</em> <a
						href="javascript:void(0);" target="_self" reldate="s7418">Socket
						TR4</a> <a href="javascript:void(0);" target="_self" reldate="s7272">Socket
						AM4</a> <a href="javascript:void(0);" target="_self" reldate="s6816">Socket
						AM3+ </a> <a href="javascript:void(0);" target="_self" reldate="s6817">Socket
						AM3</a> <a href="javascript:void(0);" target="_self" reldate="s6818">Socket
						FM2+</a> <a href="javascript:void(0);" target="_self" reldate="s6819">Socket
						FM2</a> <a href="javascript:void(0);" target="_self" reldate="s6820">Socket
						FM1</a> <em class="khr">）</em>
				</div>
				<a class="J_ViewMore view-more" data-target="J_ParamItem4"
					href="javascript:;" target="_self" data-on="0">更多<i></i></a>
			</div>
			<div id="J_MoreFilterItem" class="hide">
				<div id="pamItem3" class="filter-item">
					<strong class="filter-type">核心数量：</strong>
					<div id="J_ParamItem3" class="param-value-list">
						<span class="all active" reldate="0">不限</span> <a
							href="javascript:void(0);" target="_self" reldate="s7420">十六核心</a>
						<a href="javascript:void(0);" target="_self" reldate="s7419">十二核心</a>
						<a href="javascript:void(0);" target="_self" reldate="s7315">十核心</a>
						<a href="javascript:void(0);" target="_self" reldate="s6801">八核心</a>
						<a href="javascript:void(0);" target="_self" reldate="s6802">六核心</a>
						<a href="javascript:void(0);" target="_self" reldate="s6803">四核心</a>
						<a href="javascript:void(0);" target="_self" reldate="s6804">三核心</a>
						<a href="javascript:void(0);" target="_self" reldate="s6805">双核心</a>
					</div>
					<a class="J_ViewMore view-more" data-target="J_ParamItem4"
						href="javascript:;" target="_self" data-on="0"
						style="display: none;">更多<i></i></a>
				</div>
				<div id="pamItem4" class="filter-item">
					<strong class="filter-type">集成显卡：</strong>
					<div id="J_ParamItem4" class="param-value-list">
						<span class="all active" reldate="0">不限</span> <a
							href="javascript:void(0);" target="_self" reldate="s7192">是</a> <a
							href="javascript:void(0);" target="_self" reldate="s7193">否</a>
					</div>
					<a class="J_ViewMore view-more" data-target="J_ParamItem4"
						href="javascript:;" target="_self" data-on="0"
						style="display: none;">更多<i></i></a>
				</div>
			</div>
			
			<!--hide end-->
		</div>

		<!--  -->
	</div>
	
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
				<td colspan="2"><input type="button" class="login" value="登录"
					onclick="login1()" /></td>
				<a href="front/forgetPwd.html" class="forgetpsw">忘记密码?</a>
			</tr>
		</table>
	</div>
	</div>
=======
	<div class="conditions"> 
	   <!--list-title end--> 
	   <div id="J_ManuFilter" class="filter-brand filter-brand-multi"> 
	    <strong class="filter-type">CPU名称：</strong> 
	    <div id="J_ParamBrand" class="brand-hot brand-list" style="display: block;"> 
	     <span class="all active" reldate="0">不限</span> 
	      <div class="search-box"> 
			<input type="text" value="请输入名称" /> 
	     	<i></i>
	     </div>
	    </div> 
	   </div> 
	   
	   <div id="priceItem" class="filter-item filter-price"> 	   
	    <strong class="filter-type">价格区间：</strong> 
	    <div id="J_ParamPrice" class="param-value-list"> 
	     <span reldate="noPrice" class="all active">不限</span> 
	     <a href="javascript:void(0);" target="_self" reldate="0">500元以下</a> 
	     <a href="javascript:void(0);" target="_self" reldate="500">500-1499元</a> 
	     <a href="javascript:void(0);" target="_self" reldate="1500">1500元以上</a> 
	    </div> 
	    <div class="price-self"> 
	     <input id="minPrice" type="text" /> 
	     <em>-</em> 
	     <input id="maxPrice" type="text" /> 
	     <span id="subPri" class="price-button">确定</span> 
	    </div> 
	   </div>
	   
	    
	   <div id="pamItem1" class="filter-item"> 
	    <strong class="filter-type">CPU主频：</strong> 
	    <div id="J_ParamItem1" class="param-value-list"> 
	     <span class="all active" reldate="0">不限</span> 
	     <a href="javascript:void(0);" target="_self" reldate="s8179">2.0GHz以上</a> 
	     <a href="javascript:void(0);" target="_self" reldate="s8180">2.5GHz以上</a> 
	     <a href="javascript:void(0);" target="_self" reldate="s8188">3.0GHz以上</a> 
	     <a href="javascript:void(0);" target="_self" reldate="s8189">3.5GHz以上</a> 
	     <a href="javascript:void(0);" target="_self" reldate="s8190">4.0GHz以上</a> 

	    </div> 	    
	   </div> 
	   
	   

	   
	   <div id="J_MoreFilterItem" class="hide"> 
	    <div id="pamItem3" class="filter-item"> 
	     <strong class="filter-type">核心数量：</strong> 
	     <div id="J_ParamItem3" class="param-value-list"> 
	      <span class="all active" reldate="0">不限</span> 
	      <a href="javascript:void(0);" target="_self" reldate="s7420">十六核心</a> 
	      <a href="javascript:void(0);" target="_self" reldate="s7419">十二核心</a> 
	      <a href="javascript:void(0);" target="_self" reldate="s7315">十核心</a> 
	      <a href="javascript:void(0);" target="_self" reldate="s6801">八核心</a> 
	      <a href="javascript:void(0);" target="_self" reldate="s6802">六核心</a> 
	      <a href="javascript:void(0);" target="_self" reldate="s6803">四核心</a> 
	      <a href="javascript:void(0);" target="_self" reldate="s6804">三核心</a> 
	      <a href="javascript:void(0);" target="_self" reldate="s6805">双核心</a> 
	     </div> 
	     <a class="J_ViewMore view-more" data-target="J_ParamItem4" href="javascript:;" target="_self" data-on="0" style="display: none;">更多<i></i></a> 
	    </div> 
	    

	   <!--hide end--> 
	  </div> 
		<!--  -->
	</div>
>>>>>>> b5e6f668d76f56e02cbcc6327babc274f38c116e


	<script type="text/javascript">
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
		}

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
				<td colspan="2"><input type="button" class="login" value="登录"
					onclick="login1()" /></td>
				<a href="front/forgetPwd.html" class="forgetpsw">忘记密码?</a>
			</tr>
		</table>
	</div>
