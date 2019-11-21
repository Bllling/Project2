create database project2 default character set utf8 collate utf8_bin;
use project2;
-- 管理员表 (管理员编号，管理员昵称，管理员密码，管理员邮箱，管理员手机号)
create table if not exists admin(
	aid int primary key auto_increment, 
	aname varchar(100) not null unique, 
	apwd varchar(100) not null, 
	aemail varchar(100) not null unique, 
	atel varchar(100) not null unique 
)ENGINE=InnoDB AUTO_INCREMENT=101 default charset=utf8 collate = utf8_bin;

-- 用户表（用户编号，用户昵称，用户密码，用户邮箱，用户手机，用户头）
create table if not exists usr(
	uid int primary key auto_increment, 
	uname varchar(100) not null unique,
	upwd varchar(100) not null, 
	uemail varchar(100) not null unique, 
	utel varchar(100) not null  unique, 
	upics varchar(1000) 
)ENGINE=InnoDB AUTO_INCREMENT=10001 default charset=utf8 collate = utf8_bin;

-- 收货地址表（收货省，收货市，收货县/区，收货详细地址）
create table if not exists address(
    arid int primary key auto_increment,
	province varchar(1000) not null, 
	city varchar(1000) not null, 
	county varchar(1000) not null, 
	raddress varchar(1000) not null,
	isdefault int not null,
	uid int ,
	addrname varchar(50) not null,  --收货人姓名
	addrtel varchar(20)  --收货人电话
	constraint FK_address_uid foreign key(uid) references usr(uid)
)ENGINE=InnoDB AUTO_INCREMENT=1 default charset=utf8 collate = utf8_bin;

-- (cpu编号 cpu名 图片 价格 库存 使用次数 点赞数  跑分 功率 核心数 线程数 默认主频 最大主频)
create table cpu(
	cpuid int  primary key auto_increment, -- cpu编号
	name varchar(50),  -- cpu名
	pics varchar(1000), -- 图片
	cpuprice decimal(8,2), -- 价格
	quantiy int, -- 库存
	usetimes int, -- 使用次数
	praise int,   -- 点赞数
	score varchar(50),	  -- 跑分
	powers varchar(50),  -- 功率
	cores int,	  -- 核心数
	threads int,	  -- 线程数
	frequency varchar(5), -- 默认主频
	maxfrequency varchar(5), --最大主频
	state int  --是否被删除的状态   1：未删除  0：已删除 默认为1
)ENGINE=InnoDB AUTO_INCREMENT=10001 default charset=utf8 collate = utf8_bin;


create table motherboard(
	motherboardid int  primary key auto_increment, -- 主板编号
	name  varchar(50),  -- 主板名
	pics varchar(1000), -- 图片
	motherboardprice decimal(8,2), -- 价格
	quantiy int, -- 库存
	usetimes int, -- 使用次数
	praise int,   -- 点赞数
	score varchar(50),	  -- 跑分
	powers varchar(50),  -- 功率
	maxmemory varchar(50),-- 最大内存
	state int  --是否被删除的状态   1：未删除  0：已删除 默认为1
)ENGINE=InnoDB AUTO_INCREMENT=10001 default charset=utf8 collate = utf8_bin;


create table memory(
	memoryid int  primary key auto_increment, -- 内存编号
	name varchar(50),  -- 内存名
	pics varchar(1000), -- 图片
	memoryprice decimal(8,2), -- 价格
	quantiy int, -- 库存
	usetimes int, -- 使用次数
	praise int,   -- 点赞数
	score varchar(50),	  -- 跑分
	powers varchar(50),  -- 功率
	volume varchar(50),   -- 内存容量
	memorytype varchar(50), -- 内存类型
	frequency varchar(50),  -- 内存主频
	state int  --是否被删除的状态   1：未删除  0：已删除 默认为1
)ENGINE=InnoDB AUTO_INCREMENT=10001 default charset=utf8 collate = utf8_bin;

create table disk(
	diskid int  primary key auto_increment, -- 硬盘编号
	name varchar(50),  -- 硬盘名
	pics varchar(1000), -- 图片
	diskprice decimal(8,2), -- 价格
	quantiy int, -- 库存
	usetimes  int, -- 使用次数
	praise int,   -- 点赞数
	score varchar(50),	  -- 跑分
	powers varchar(50),  -- 功率
	volume varchar(50),   -- 硬盘容量
	isssd int, -- 是否为固态
	rpm varchar(50),  -- 转数
	state int  --是否被删除的状态   1：未删除  0：已删除 默认为1
)ENGINE=InnoDB AUTO_INCREMENT=10001 default charset=utf8 collate = utf8_bin;

create table source(
	sourceid int primary key auto_increment, -- 电源编号
	name varchar(50),  -- 电源名
	pics varchar(1000), -- 图片
	sourceprice decimal(8,2), -- 价格
	quantiy int, -- 库存
	usetimes int, -- 使用次数
	praise int,   -- 点赞数
	score varchar(50),	  -- 跑分
	maxpowers varchar(50),  -- 最大功率
	state int  --是否被删除的状态   1：未删除  0：已删除 默认为1
)ENGINE=InnoDB AUTO_INCREMENT=10001 default charset=utf8 collate = utf8_bin;

create table graphics(
	graphicsid int primary key auto_increment, -- 显卡编号
	name varchar(50),  -- 显卡名
	pics varchar(1000), -- 图片
	graphicsprice decimal(8,2), -- 价格
	quantiy int, -- 库存
	usetimes int, -- 使用次数
	praise int,   -- 点赞数
	score varchar(50),	  -- 跑分
	powers varchar(50),  -- 功率
	memory varchar(50),  -- 显存大小
	width varchar(50),   -- 显存带宽
	state int  --是否被删除的状态   1：未删除  0：已删除 默认为1
)ENGINE=InnoDB AUTO_INCREMENT=10001 default charset=utf8 collate = utf8_bin;

create table box(
	boxid int primary key auto_increment, -- 机箱编号
	name varchar(50),  -- 机箱名
	pics varchar(1000), -- 图片
	boxprice decimal(8,2), -- 价格
	quantiy int, -- 库存
	usetimes int, -- 使用次数
	praise int, -- 点赞数
	state int  --是否被删除的状态   1：未删除  0：已删除 默认为1
)ENGINE=InnoDB AUTO_INCREMENT=10001 default charset=utf8 collate = utf8_bin;



-- 配置单表（配置单号，用户编号,发布时间，点赞数，浏览次数，评论数）
create table if not exists computer(
	id  int primary key auto_increment, -- 配置单号
	uid int,  -- 用户编号
	cname varchar(50), -- 配置单名
	detail text, -- 配置说明
	rtime datetime not null, -- 发布时间
	znumber int , -- 点赞数
	bnumber int ,  -- 浏览次数
	cpuid int,   -- cpu编号
	motherboardid int,  -- 主板编号
	memoryid int,   -- 内存编号
	diskid int,     -- 硬盘编号
	sourceid int,    -- 电源编号
	graphicsid int,   -- 显卡编号
	boxid int,       -- 机箱编号
	sumprice decimal(8,2), -- 总价格
	detail text ,--描述
	cname varchar(50), --名称
	constraint FK_computer_uid foreign key(uid) references usr(uid),
	constraint FK_computer_motherboardid foreign key(motherboardid) references motherboard(motherboardid),
	constraint FK_computer_cpuid foreign key(cpuid) references cpu(cpuid),
	constraint FK_computer_memoryid foreign key(memoryid) references memory(memoryid),
	constraint FK_computer_diskid foreign key(diskid) references disk(diskid),
	constraint FK_computer_sourceid foreign key(sourceid) references source(sourceid),
	constraint FK_computer_graphicsid foreign key(graphicsid) references graphics(graphicsid),
	constraint FK_computer_boxid foreign key(boxid) references box(boxid)
)ENGINE=InnoDB AUTO_INCREMENT=1001 default charset=utf8 collate = utf8_bin;

-- 评论表(配置单号 ,评论时间，用户编号，评论内容)
create table if not exists comment(
    commentid int primary key auto_increment,
	id int , -- 配置单号
	commenttime datetime not null, -- 评论时间
	uid int,  -- 用户编号 
	content varchar(1000), -- 评论内容
	praise int,  --点赞数
	constraint FK_collections_uid foreign key(uid) references usr(uid),
	constraint FK_collections_id foreign key(id) references computer(id)
)ENGINE=InnoDB AUTO_INCREMENT=1001 default charset=utf8 collate = utf8_bin;

-- 收藏夹表(配置单号，收藏时间，--用户编号)
create table if not exists collection(
   collectionid int primary key auto_increment,
	id int , -- 配置单号,
	ctime time not null, -- 收藏时间
	uid int,  -- 用户编号
	constraint FK_collection_uid foreign key(uid) references usr(uid),
	constraint FK_collection_id foreign key(id) references computer(id)
)ENGINE=InnoDB AUTO_INCREMENT=1001 default charset=utf8 collate = utf8_bin;




create table if not exists rorder(
	rorderid varchar(50) primary key ,
	id int , -- 配置单号
	uid int,  -- 用户编号,
	rtime datetime , -- 交易时间
	province varchar(1000) not null, -- 收货省
	city varchar(1000) not null,  -- 收货市
	county varchar(1000) not null,  -- 收货县/区
	raddress varchar(1000) not null, -- 收货详细地址
	total decimal(8,2) not null,    -- 总价
	constraint FK_rorder_uid foreign key(uid) references usr(uid),
	constraint FK_rorder_id foreign key(id) references computer(id)
)ENGINE=InnoDB  default charset=utf8 collate = utf8_bin;

create table if not exists rorderdetail(
	rorderid varchar(50) primary key ,
	id int , -- 配置单号
	uid int,  -- 用户编号,
	cpuprice decimal(8,2), -- cpu价格
	motherboardprice decimal(8,2), -- 主板价格
	memoryprice decimal(8,2),    -- 内存价格
	diskprice decimal(8,2),     --  硬盘价格
	ssdprice decimal(8,2),      -- 固态硬盘价格
	sourceprice decimal(8,2),   -- 电源价格
	graphicsprice decimal(8,2), -- 显卡价格
	boxprice decimal(8,2), -- 机箱价格
	cpuid int,   -- cpu编号
	motherboardid int,  -- 主板编号
	memoryid int,   -- 内存编号
	diskid int,     -- 硬盘编号
	sourceid int,    -- 电源编号
	graphicsid int,   -- 显卡编号
	boxid int,       -- 机箱编号
	constraint FK_rorder1_rorderid foreign key(rorderid) references rorder(rorderid),
	constraint FK_rorder1_motherboardid foreign key(motherboardid) references motherboard(motherboardid),
	constraint FK_rorder1_cpuid foreign key(cpuid) references cpu(cpuid),
	constraint FK_rorder1_memoryid foreign key(memoryid) references memory(memoryid),
	constraint FK_rorder1_diskid foreign key(diskid) references disk(diskid),
	constraint FK_rorder1_sourceid foreign key(sourceid) references source(sourceid),
	constraint FK_rorder1_graphicsid foreign key(graphicsid) references graphics(graphicsid),
	constraint FK_rorder1_boxid foreign key(boxid) references box(boxid),
	constraint FK_rorder1_uid foreign key(uid) references usr(uid),
	constraint FK_rorder1_id foreign key(id) references computer(id)
)ENGINE=InnoDB  default charset=utf8 collate = utf8_bin;




