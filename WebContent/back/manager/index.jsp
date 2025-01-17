<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>攒机系统-后台管理</title>
<link rel="stylesheet" type="text/css" href="../../easyui/css/easyui.css" />
<link rel="stylesheet" type="text/css" href="../../easyui/css/wu.css" />
<link rel="stylesheet" type="text/css" href="../../easyui/css/icon.css" />
<link rel="stylesheet" type="text/css" href="../../css/add_hardware.css" />
<link rel="stylesheet" type="text/css" href="../../css/view_hardware.css" />
<script type="text/javascript" src="../../easyui/js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="../../easyui/js/jquery.easyui.min.js"></script>
<script type="text/javascript" src="../../easyui/js/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="../../js/showpic.js"></script>
<script type="text/javascript" src="../../js/ajaxfileupload.js"></script>
</head>
<body class="easyui-layout">
	<!-- begin of header -->
	<div class="wu-header" data-options="region:'north',border:false,split:true">
    	<div class="wu-header-left">
        	<h1>攒机系统--后台</h1>
        </div>
        <div class="wu-header-right">
        	<p><strong class="easyui-tooltip" title="2条未读消息">${admin.aname }</strong>，欢迎您！</p>
            <p><a href="#">网站首页</a>|<a href="#">支持论坛</a>|<a href="#">帮助中心</a>|<a href="#">安全退出</a></p>
        </div>
    </div>
    <!-- end of header -->
    <!-- begin of sidebar -->
	<div class="wu-sidebar" data-options="region:'west',split:true,border:true,title:'导航菜单'"> 
    	<div class="easyui-accordion" data-options="border:false,fit:true"> 
        	
            
            <div title="管理菜单" data-options="iconCls:'icon-application-cascade'" style="padding:5px;">  	
    			<ul class="easyui-tree wu-side-tree">
                    
                    <li iconCls="icon-cput"><a href="javascript:void(0)" data-icon="icon-cput" data-link="add_cpu.html" iframe="0">CPU添加</a></li>
                    <li iconCls="icon-motherboard"><a href="javascript:void(0)" data-icon="icon-motherboard" data-link="add_motherboard.html" iframe="0">添加主板</a></li>
                    <li iconCls="icon-memory"><a href="javascript:void(0)" data-icon="icon-memory" data-link="add_memory.html" iframe="0">添加内存</a></li>
                    <li iconCls="icon-diskt"><a href="javascript:void(0)" data-icon="icon-diskt" data-link="add_disk.html" iframe="0">添加硬盘</a></li>
                    <li iconCls="icon-source"><a href="javascript:void(0)" data-icon="icon-source" data-link="add_source.html" iframe="0">添加电源</a></li>
                    <li iconCls="icon-graphics"><a href="javascript:void(0)" data-icon="icon-graphics" data-link="add_graphics.html" iframe="0">添加显卡</a></li>
                    <li iconCls="icon-boxt"><a href="javascript:void(0)" data-icon="icon-boxt" data-link="add_box.html" iframe="0">添加机箱</a></li>
                    <li iconCls="icon-view"><a href="javascript:void(0)" data-icon="icon-view" data-link="view_hardware.html" iframe="0">浏览硬件</a></li>
                    <li iconCls="icon-view"><a href="javascript:void(0)" data-icon="icon-view" data-link="view_computer.html" iframe="0">浏览配置单</a></li>
                	<li iconCls="icon-view"><a href="javascript:void(0)" data-icon="icon-view" data-link="view_order.html" iframe="0">管理订单</a></li>
                </ul>
            </div>
            
            <div title="系统设置" data-options="iconCls:'icon-wrench'" style="padding:5px;">  	
    			<ul class="easyui-tree wu-side-tree">
                    <li iconCls="icon-cog"><a href="javascript:void(0)" data-icon="icon-cog" data-link="temp/layout-3.html" iframe="0">导航标题</a></li>
                  
                </ul>
            </div>
        </div>
    </div>	
    <!-- end of sidebar -->    
    <!-- begin of main -->
    <div class="wu-main" data-options="region:'center'">
        <div id="wu-tabs" class="easyui-tabs" data-options="border:false,fit:true">  
            <div title="首页" data-options="href:'',closable:false,iconCls:'icon-tip',cls:'pd3'"></div>
        </div>
    </div>
    <!-- end of main --> 
    <!-- begin of footer -->
	<div class="wu-footer" data-options="region:'south',border:true,split:true">
    	&copy; 2013 Wu All Rights Reserved
    </div>
    <!-- end of footer -->  
    <script type="text/javascript">
		$(function(){
			$('.wu-side-tree a').bind("click",function(){
				var title = $(this).text();
				var url = $(this).attr('data-link');
				var iconCls = $(this).attr('data-icon');
				var iframe = $(this).attr('iframe')==1?true:false;
				addTab(title,url,iconCls,iframe);
			});	
		});

		/**
		* Name 选项卡初始化
		*/
		$('#wu-tabs').tabs({
			tools:[{
				iconCls:'icon-reload',
				border:false,
				handler:function(){
					$('#wu-datagrid').datagrid('reload');
				}
			}]
		});
			
		/**
		* Name 添加菜单选项
		* Param title 名称
		* Param href 链接
		* Param iconCls 图标样式
		* Param iframe 链接跳转方式（true为iframe，false为href）
		*/	
		function addTab(title, href, iconCls, iframe){
			var tabPanel = $('#wu-tabs');
			if(!tabPanel.tabs('exists',title)){
				var content = '<iframe scrolling="auto" frameborder="0"  src="'+ href +'" style="width:100%;height:100%;"></iframe>';
				if(iframe){
					tabPanel.tabs('add',{
						title:title,
						content:content,
						iconCls:iconCls,
						fit:true,
						cls:'pd3',
						closable:true
					});
				}
				else{
					tabPanel.tabs('add',{
						title:title,
						href:href,
						iconCls:iconCls,
						fit:true,
						cls:'pd3',
						closable:true
					});
				}
			}
			else
			{
				tabPanel.tabs('select',title);
			}
		}
		/**
		* Name 移除菜单选项
		*/
		function removeTab(){
			var tabPanel = $('#wu-tabs');
			var tab = tabPanel.tabs('getSelected');
			if (tab){
				var index = tabPanel.tabs('getTabIndex', tab);
				tabPanel.tabs('close', index);
			}
		}
	</script>
</body>
</html>
