<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<meta charset="utf-8" />
<link href="../css/Diy_WyListPlan.css" rel="stylesheet">
<link rel="../css/share_style0_16.css">
<link rel="../css/global-sitennav.css">
<style>
  .navs-box .inf{width:684px;}
  .navs-box .inf .list{float:right;}
  .zol20th{float: left;width: 50px;height: 36px;margin: 8px 0 0 219px;background: url(//icon.zol-img.com.cn/article/2011/logo2019/20th.png) no-repeat center;}
</style>
</head>

<body>

<div class="nav-search">
    <div class="navs-box clearfix">
        <span class="zol20th"></span>
        <div class="inf">
           <ul >
              <li class="li5">
                  <div class="search-box">
                       <input id="J_keywords" type="text" class="skey" name="kword" value="请输入关键词或配置单名称" data-source="" autocomplete="off">
                       <input id="submit" type="submit" class="sbtn" value="搜索">
                 </div>
              </li>
           </ul>
        </div>
    </div>
</div>
 


<!--wrap start-->
<div class="nav"  >
    <div class="nav-box">
       <ul class="navul" style="min-width: 800px;margin-left: 150px;">
		   
         <li id="menu_nav_index"><a target="_self" href="../index1.jsp">模拟攒机</a></li>
		 <li id="menu_nav_myplan"><a  href="myplan.jsp">我的方案</a></li>
		 <li id="menu_nav_wyplan"><a class="active"  target="_self" >网友方案</a></li>
		 <li id="menu_nav_DiyTop"><a target="_self" href="#">配置排行榜</a></li>
		 <li id="menu_nav_ProTop"><a target="_self" href="rank.html">网友首选配件</a></li>
		 <li id="menu_nav_Graphics"><a target="_blank" href="#">智能推荐攒机</a></li>
       </ul>
      
    </div>
</div>
 <div class="wrap">
   <div class="box netfriend-plan clearfix">
	 <!--左侧 start-->
	 <div class="wleft" id="show">
		<div class="process">
			<a href="../index1.jsp">ZOL攒机首页</a>&gt;&nbsp;<span>网友方案</span> 
		  
		</div>
		<div class="conditions">
			<div class="list-title">
			   <h3>网友热门方案</h3>
			</div>
			
			<div id="J_ParamFilter" class="param-filter">
				<div id="sel-cond" class="filter-item">
						<strong class="filter-type">已选条件：</strong>
						<div id="J_FilterSelected" class="param-selected clearfix">
						  <a href="javascript:clear()" class="reset" target="_self">清空</a>         
						           
						  
						</div>
					 </div>			   <div id="pamItem1" class="filter-item">
				 
				               
			   </div>
			   <div id="priceItem" class="filter-item filter-price" style="height: 80px; margin-top: 20px;">
					<strong class="filter-type">价格区间：</strong>
					<div id="J_ParamPrice1" class="param-value-list" >
						<a href="javascript:clear1()" target="_self" >不限</a>
						<a href="javascript:add3()" target="_self">3000以下</a>
						<a href="javascript:add34()" target="_self">3000-4000元</a>
						<a href="javascript:add45()" target="_self">4000-5000元</a>
						<a href="javascript:add56()" target="_self">5000-6000元</a>
						<a href="javascript:add67()" target="_self">6000-7000元</a>
						<a href="javascript:add78()" target="_self">7000-8000元</a>
						<a href="javascript:add8()" target="_self">8000元以上</a>				
						</div>        
				  
			   </div>
			 
			   <div id="pamItem3" class="filter-item filter-price" style="margin-top: 6px;">
					<strong class="filter-type">配置时间：</strong>
					<div id="J_ParamPrice" class="param-value-list">
						<a href="javascript:clear2()" target="_self" class="all">不限</a>
						<a href="javascript:add2019()" target="_self">2019年</a>
						<a href="javascript:add2018()" target="_self">2018年</a>
						<a href="javascript:add2017()" target="_self">2017年</a>
						<a href="javascript:add2016()" target="_self">2016年</a>
						<a href="javascript:add2015()" target="_self">2015年</a>
						<a href="javascript:add2014()" target="_self">2014年</a>						
				   </div>        
				   
			   </div>
			</div>
			
		</div>
		<div class="sort-box clearfix" >
		 <div class="small-page">
			 			 <a class="small-page-prev " href="#" target="_self">&nbsp;</a>
			<span class="small-page-active"><b>1</b>/50</span>
			<a href="#" class="small-page-next " target="_self">&nbsp;</a>
		 </div>      
		 <span class="total">共 <b style="color: #999;">11111</b>款</span>
		 <div class="sort">
			 			 <a class="hovera" id="select1" href="javascript:new1()" target="_self" title="价格由低到高"><em>最新</em><i class=""></i></a>
			 <a class="hovera" id="select2" href="javascript:hot()" target="_self"><em>最热门</em></a> 
			<a class="hovera" id="select3" href="javascript:price()" target="_self"><em>价格</em><i class="up"></i></a>
			
		 </div>
		</div>
		<div id="list">
		
		</div>
	</div>
	 <!--左侧 end-->
	 <!--右侧 start-->
	 <div class="wright">
		<!--登录 start-->
		<!--个人信息 start-->
                <div class="per-infor" style="display: none;">
                    <p class="title">个人信息</p>
                    <div class="edit-box clearfix">
                        <div class="head-portrait"><img src=" ../images/null.jpg" width="75" height="75" alt="头像"></div>
                       <div class="right">
                          <p><a href="javascript:void(0)" class="name">${currentAdmin.uname}</a></p>
                          
                       </div>
                    </div>
                    <table >
                        <tbody style="height: 50px;"><tr >
                           <td >
                              <a href="javascript:void(0)" class="item-link fanan">
                                <h1>xx</h1>
                                方案
                              </a>
                           </td>
                           <td>
                             <a href="javascript:void(0)" class="item-link l2 review">
                                 <h1>xx</h1>
                                浏览
                              </a>
                           </td>
                           <td>
                              <a href="javascript:void(0)" class="item-link l3 hitNum">
                                <h1>xx</h1>
                                点评
                              </a>
                           </td>
                        </tr>
                    </tbody></table>         
                 </div>
                 <!--个人信息 end-->
                 <!--登录 start-->
                 <div class="logo" style="display: block;">             
                     <p class="title" style=" width: 310px;margin-right: -200px;">用户登录 <a href="register.html" class="more">免费注册<font>&gt;&gt;</font></a></p>
                     <div class="inf" style=" width: 304px;">
                       
                         <form action="http://zj.zol.com.cn/list_l2_1_1.html" target="noform">
                        <div class="text-inf">
                            <span class="inst"></span>
                         
                          <input type="text" class="username login" placeholder="邮箱/手机号"  id="userName1" rel="uname-inst" value=""> 
                          <input type="password" class="pwd login"   placeholder="密码" id="passWord1" rel="pwd-inst" value="">
                        </div>
                        <div class="other">
                           
                           <a href="forgetPwd.html" class="forget">忘记密码?</a>
                        </div>
                        <input type="buttons" class="subm" value="登录" onclick="login()">
                        
                     </form>
                     </div>
                 </div>
		
	</div>
   </div>
 </div>
	<script src="../js/Diy_WyListPlan.js.下载"></script>
<script src="../js/picLazyLoad.js.下载"></script>
<script type="../js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
var page=0,pics=null,pLen=0,mWidth=625;
$(function(){
	hot();
    var str=$(".name").html();
	if(str!=null&&str.length > 0&&""!=str){
	
		 $(".logo").css("display","none");
		 $(".per-infor").css("display","block");
	 }
 
})
function clear(){
	$("#J_FilterSelected").html("<a href='javascript:clear()' class='reset' target='_self'>清空</a>"); 
	$("#J_ParamPrice1 a").removeClass("active");
	$("#J_ParamPrice a").removeClass("active");
}
function clear1(){
	$("#J_FilterSelected").html("<a href='javascript:clear()' class='reset' target='_self'>清空</a>"); 
	$("#J_ParamPrice1 a").removeClass("active");
	$("#J_ParamPrice1 a").eq(0).addClass("active");
}
function clear2(){
	$("#J_FilterSelected").html("<a href='javascript:clear()' class='reset' target='_self'>清空</a>"); 
	$("#J_ParamPrice a").removeClass("active");
	$("#J_ParamPrice a").eq(0).addClass("active");
}
function add3(){
	$("#J_ParamPrice1 a").eq(0).removeClass("active");
	$("#J_FilterSelected").append('<a id="price" href="javascript:void(0)" target="_self">3000元以下</a> ');
	$("#J_ParamPrice1 a").eq(1).addClass("active");
}
function add34(){
	$("#J_ParamPrice1 a").eq(0).removeClass("active");
	$("#J_FilterSelected").append('<a id="price" href="javascript:void(0)" target="_self">3000-4000元</a> ');
	$("#J_ParamPrice1 a").eq(2).addClass("active");
}
function add45(){
	$("#J_ParamPrice1 a").eq(0).removeClass("active");
	$("#J_FilterSelected").append('<a id="price" href="javascript:void(0)" target="_self">4000-5000元</a> ');
	$("#J_ParamPrice1 a").eq(3).addClass("active");
}
function add56(){
	$("#J_ParamPrice1 a").eq(0).removeClass("active");
	$("#J_FilterSelected").append('<a id="price" href="javascript:void(0)" target="_self">5000-6000元</a> ');
	$("#J_ParamPrice1 a").eq(4).addClass("active");
}
function add67(){
	$("#J_ParamPrice1 a").eq(0).removeClass("active");
	$("#J_FilterSelected").append('<a id="price" href="javascript:void(0)" target="_self">6000-7000元</a> ');
	$("#J_ParamPrice1 a").eq(5).addClass("active");
}
function add78(){
	$("#J_ParamPrice1 a").eq(0).removeClass("active");
	$("#J_FilterSelected").append('<a id="price" href="javascript:void(0)" target="_self">7000-8000元</a> ');
	$("#J_ParamPrice1 a").eq(6).addClass("active");
}
function add8(){
	$("#J_ParamPrice1 a").eq(0).removeClass("active");
	$("#J_FilterSelected").append('<a id="price" href="javascript:void(0)" target="_self">8000元以上</a> ');
	$("#J_ParamPrice1 a").eq(7).addClass("active");
}

function add2019(){
	$("#J_ParamPrice a").eq(0).removeClass("active");
	$("#J_FilterSelected").append('<a class="" href="javascript:void(0)" target="_self">2019年</a> ');
	$("#J_ParamPrice a").eq(1).addClass("active");
}
function add2018(){
	$("#J_ParamPrice a").eq(0).removeClass("active");
	$("#J_FilterSelected").append('<a class="" href="javascript:void(0)" target="_self">2018年</a> ');
	$("#J_ParamPrice a").eq(2).addClass("active");
}
function add2017(){
	$("#J_ParamPrice a").eq(0).removeClass("active");
	$("#J_FilterSelected").append('<a class="" href="javascript:void(0)" target="_self">2017年</a> ');
	$("#J_ParamPrice a").eq(3).addClass("active");
}
function add2016(){
	$("#J_ParamPrice a").eq(0).removeClass("active");
	$("#J_FilterSelected").append('<a class="" href="javascript:void(0)" target="_self">2016年</a> ');
	$("#J_ParamPrice a").eq(4).addClass("active");
}
function add2015(){
	$("#J_ParamPrice a").eq(0).removeClass("active");
	$("#J_FilterSelected").append('<a class="" href="javascript:void(0)" target="_self">2015年</a> ');
	$("#J_ParamPrice a").eq(5).addClass("active");
}
function add2014(){
	$("#J_ParamPrice a").eq(0).removeClass("active");
	$("#J_FilterSelected").append('<a class="" href="javascript:void(0)" target="_self">2014年</a> ');
	$("#J_ParamPrice a").eq(6).addClass("active");
}
function login(){
	 var uname =$.trim($("#userName1").val());
		var upwd = $.trim($("#passWord1").val());
	
		if (uname == "") {
			alert("请输入手机号或邮箱地址...");
			return;
		}
		
		if (upwd == "") {
			alert("请输入密码...");
			return;
		}
		$.post("../usr",{op:"login",uname:uname,upwd:upwd},function(data){
			 data=parseInt($.trim(data));
		
			 if(data==1){
				 $(".logo").css("display","none");
				 $(".per-infor").css("display","block");
				 window.location.reload();
				
	    	 }else{
	    		 alert("账号或密码错误，请重新登陆！")
	    	 }
		},"text")
 }
 function new1(){
	 $('#select1').css('background','#3891ed');
	 $('#select2').css('background','#FAFAFA ');
	 $('#select3').css('background','#FAFAFA ');
	 $.post("../computer",{op:"findAll",type:"rtime"},function(data){
		 $("#list").html("");
		 var str = "";
		 $.each(data,function(index,item){
		
				str+='<div class="plan-list-box" id="list"><ul class="list show-list"><li class="outli" ><p class="tit big-title" > <a href="buy.html#'+item.id+'" class="link" title="">'+item.cname+'</a><span class="collect" hadrel="0"><i></i><a href="javascript:;" target="_self">收藏此配置</a></span></p><p class="total-box"> <span class="user"><i></i><a href="javascript:void(0)">'+item.uname+'</a></span><span class="time">'+item.rtime+' </span><span class="total">总计：<font>'+item.sumprice+'</font>元</span></p><p class="text">'+item.detail+'</p><div class="pics"><i class="iprev" onclick="prev()"></i><i class="inext" onclick="next()"></i>  <div class="lunbo-box"><ul><li><a href="javascript:void(0)"><div class="ig"><img src="../'+item.pics+'" alt="CPU"></div> <p class="titl" title="">'+item.name+'</p></a></li><li><a href="javascript:void(0)"><div class="ig"> <img src="../'+item.pics1+'" alt="主板"></div><p class="titl" title="">'+item.name1+'</p></a></li><li><a href="javascript:void(0)"><div class="ig"> <img src="../'+item.pics2+'" alt="内存"></div><p class="titl" title="">'+item.name2+'</p></a></li><li><a href="javascript:void(0)"><div class="ig"><img src="../'+item.pics3+'" alt="硬盘"></div><p class="titl" title="">'+item.name3+'</p></a> </li><li><a href="javascript:void(0)"><div class="ig"> <img src="../'+item.pics4+'" alt="电源"></div><p class="titl" title="">'+item.name4+'</p></a></li><li><a href="#"><div class="ig"><img src="../'+item.pics5+'" alt="显卡"></div> <p class="titl" title="">'+item.name5+'</p></a></li><li><a href="javascript:void(0)"><div class="ig"><img src="../'+item.pics6+'" alt="机箱"></div><p class="titl" title="">'+item.name6+'</p></a></li> </ul></div> </div><div class="other clearfix"><span class="editss cite"><a href="#" class="editss">引用此配置单进行攒机<font>&gt;&gt;</font></a></span> </div> </li><div class="page-box"></div></div>';
		 
		 })
		 $("#list").append($(str));
		
	 },"json")
 }
function hot(){
	 $('#select1').css('background','#FAFAFA ');
	 $('#select2').css('background','#3891ed');
	 $('#select3').css('background','#FAFAFA ');
	 $(".howera").attr("class",".sort .active");
 $.post("../computer",{op:"findAll",type:"bnumber"},function(data){
	 $("#list").html("");
	 var str = "";
	 $.each(data,function(index,item){
		console.log(item);
		str+='<div class="plan-list-box" id="list"><ul class="list show-list"><li class="outli" ><p class="tit big-title" > <a href="buy.html#'+item.id+'" class="link" title="">'+item.cname+'</a><span class="collect" hadrel="0"><i></i><a href="javascript:;" target="_self">收藏此配置</a></span></p><p class="total-box"> <span class="user"><i></i><a href="javascript:void(0)">'+item.uname+'</a></span><span class="time">'+item.rtime+' </span><span class="total">总计：<font>'+item.sumprice+'</font>元</span></p><p class="text">'+item.detail+'</p><div class="pics"><i class="iprev" onclick="prev()"></i><i class="inext" onclick="next()"></i>  <div class="lunbo-box"><ul><li><a href="javascript:void(0)"><div class="ig"><img src="../'+item.pics+'" alt="CPU"></div> <p class="titl" title="">'+item.name+'</p></a></li><li><a href="javascript:void(0)"><div class="ig"> <img src="../'+item.pics1+'" alt="主板"></div><p class="titl" title="">'+item.name1+'</p></a></li><li><a href="javascript:void(0)"><div class="ig"> <img src="../'+item.pics2+'" alt="内存"></div><p class="titl" title="">'+item.name2+'</p></a></li><li><a href="javascript:void(0)"><div class="ig"><img src="../'+item.pics3+'" alt="硬盘"></div><p class="titl" title="">'+item.name3+'</p></a> </li><li><a href="javascript:void(0)"><div class="ig"> <img src="../'+item.pics4+'" alt="电源"></div><p class="titl" title="">'+item.name4+'</p></a></li><li><a href="#"><div class="ig"><img src="../'+item.pics5+'" alt="显卡"></div> <p class="titl" title="">'+item.name5+'</p></a></li><li><a href="javascript:void(0)"><div class="ig"><img src="../'+item.pics6+'" alt="机箱"></div><p class="titl" title="">'+item.name6+'</p></a></li> </ul></div> </div><div class="other clearfix"><span class="editss cite"><a href="#" class="editss">引用此配置单进行攒机<font>&gt;&gt;</font></a></span> </div> </li><div class="page-box"></div></div>';
	
	 })
	 $("#list").append($(str));
	 },"json")


	
 }
function price(){
	 $('#select1').css('background','#FAFAFA ');
	 $('#select2').css('background','#FAFAFA ');
	 $('#select3').css('background','#3891ed');
	 $(".howera").attr("class",".sort .active");
     $.post("../computer",{op:"findAll",type:"sumprice"},function(data){
	 $("#list").html("");
	 var str = "";
	 $.each(data,function(index,item){
		
			str+='<div class="plan-list-box" id="list"><ul class="list show-list"><li class="outli" ><p class="tit big-title" > <a href="buy.html#'+item.id+'" class="link" title="">'+item.cname+'</a><span class="collect" hadrel="0"><i></i><a href="javascript:;" target="_self">收藏此配置</a></span></p><p class="total-box"> <span class="user"><i></i><a href="javascript:void(0)">'+item.uname+'</a></span><span class="time">'+item.rtime+' </span><span class="total">总计：<font>'+item.sumprice+'</font>元</span></p><p class="text">'+item.detail+'</p><div class="pics"><i class="iprev" onclick="prev()"></i><i class="inext" onclick="next()"></i>  <div class="lunbo-box"><ul><li><a href="javascript:void(0)"><div class="ig"><img src="../'+item.pics+'" alt="CPU"></div> <p class="titl" title="">'+item.name+'</p></a></li><li><a href="javascript:void(0)"><div class="ig"> <img src="../'+item.pics1+'" alt="主板"></div><p class="titl" title="">'+item.name1+'</p></a></li><li><a href="javascript:void(0)"><div class="ig"> <img src="../'+item.pics2+'" alt="内存"></div><p class="titl" title="">'+item.name2+'</p></a></li><li><a href="javascript:void(0)"><div class="ig"><img src="../'+item.pics3+'" alt="硬盘"></div><p class="titl" title="">'+item.name3+'</p></a> </li><li><a href="javascript:void(0)"><div class="ig"> <img src="../'+item.pics4+'" alt="电源"></div><p class="titl" title="">'+item.name4+'</p></a></li><li><a href="#"><div class="ig"><img src="../'+item.pics5+'" alt="显卡"></div> <p class="titl" title="">'+item.name5+'</p></a></li><li><a href="javascript:void(0)"><div class="ig"><img src="../'+item.pics6+'" alt="机箱"></div><p class="titl" title="">'+item.name6+'</p></a></li> </ul></div> </div><div class="other clearfix"><span class="editss cite"><a href="#" class="editss">引用此配置单进行攒机<font>&gt;&gt;</font></a></span> </div> </li><div class="page-box"></div></div>';
		
	 })
	 $("#list").append($(str));
	 },"json")
 }
 function prev(){
	
	 $(".plan-list-box .pics i.iprev").click(function(){var $this=$(this);changePage(-1,$this)});
 }
 function next(){
	
	 $(".plan-list-box .pics i.inext").click(function(){var $this2=$(this);changePage(1,$this2)});
	
 }

 function changePage(u,_this)
 {	
	 
	console.log(page);
 	 pics=_this.parent().find(".lunbo-box ul li");
 	 pLen=Math.ceil((pics.length)/5);
 	 if(u<0){
 		 page--;
 		 if(page<0){page=pLen-1;}
 		 if(!$(".lunbo-box ul").is(":animated")) {
 			 _this.parent().find(".lunbo-box ul").animate({"left":-page*mWidth},500);
 			 }
 		 }
 	 else{
 		 if(u>0)
 		 {page++;
 		 if(page>pLen-1){
 			 page=0;}
 		 if(!$(".lunbo-box ul").is(":animated")){
 			 _this.parent().find(".lunbo-box ul").animate({"left":-page*mWidth},500);
 			 }
 		 }
 		 }
 	 }

</script>
</body></html>