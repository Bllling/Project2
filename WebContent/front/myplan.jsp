<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<meta charset="utf-8" />

<meta name="renderer" content="webkit">

<meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">

<title>我的方案</title>

<link href="../css/Diy_NetFriendList.css" rel="stylesheet">

<link rel="stylesheet" href="../css/share_style0_16.css">
<link rel="stylesheet" href="../css/global-sitennav.css">
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


  
<div class="nav"  >
    <div class="nav-box">
       <ul class="navul" style="min-width: 800px;margin-left: 150px;">
		   
         <li id="menu_nav_index"><a target="_self" href="../index1.jsp">模拟攒机</a></li>
		 <li id="menu_nav_myplan"><a class="active">我的方案</a></li>
		 <li id="menu_nav_wyplan"><a target="_self" href="netplan.jsp">网友方案</a></li>
		 <li id="menu_nav_DiyTop"><a target="_self" href="#">配置排行榜</a></li>
		 <li id="menu_nav_ProTop"><a target="_self" href="rank.html">网友首选配件</a></li>
		 <li id="menu_nav_Graphics"><a target="_blank" href="#">智能推荐攒机</a></li>
       </ul>
      
    </div>
</div>


 <div class="wrap" >
   <div class="box netpersonal-plan clearfix">
     <!--左侧 start-->
     <div class="wleft">
     <div style="width: 90% ; float: left">
        <div class="process">
          <a href="../index1.jsp">ZOL攒机首页</a>&gt;&nbsp;我的配置方案
        </div>
        <div class="sort-box clearfix" style="width: 100%">
         <div class="sort netf-sort" >
            <a href="javascript:show1()" target="_self" class="active myprofile">我的配置</a>
            <a href="javascript:show2()" class="hovera">我的收藏</a>
         </div>
        </div>
        <div class="plan-list-box">
            <div class="my-nothing">
					<div class="text">
					   <p class="inst">您目前尚无配置单，快去攒一个吧!</p>
					   <a href="../index1.jsp" class="link">我要攒机<font>&gt;&gt;</font></a>
					</div>         
			 </div>    
				
        </div>
  </div>
     <!--右侧 start-->
     <div class="wright" style="float: rigth; width: 30%; margin-right: -200px;">
        <!--登录 start-->
                 <div class="logo" style="display: block;" >
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
                        <input type="button" class="subm" value="登录" onclick="login()">
                        
                     </form>
                     </div>
                 </div>
                 <!--登录 end-->
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
	         </div>
        </div>
     
    </div>

   </div>
   <script src="../js/jquery-3.4.1.min.js"></script>
 <script type="text/javascript">
 $(function(){
	
	    var str=$(".name").html();
	    
		if(str!=null&&str.length > 0&&""!=str){
		
			 $(".logo").css("display","none");
			 $(".per-infor").css("display","block");
			
		 }
	 
 })
 function show1(){
	 alert("进入我的方案");
 }
 function show2(){
	 alert("进入我的收藏");
 }
 function login(){
	 var user=$("#userName1").val();
	 alert(user);
 }
 </script>


</body></html>