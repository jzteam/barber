create table employee (
	`id` int(11) unsigned not null auto_increment comment 'ID',
	`phone` varchar(20) not null default '' comment '手机号',
	`password` varchar(50) not null default '' comment '登录密码',
	`name` varchar(50) not null default '' comment '员工姓名',
	`sex` tinyint(3) not null default 0 comment '性别：0-男，1-女',
	`img` varchar(100) not null default '' comment '员工图像',
	`status` tinyint(3) not null default 0 comment '员工状态:0-临时，1-正式，2-离职',
	`entry_time` varchar(14) not null default '00000000000000' comment '入职日期',
	`levae_time` varchar(14) not null default '00000000000000' comment '离职日期',
	`create_time` timestamp not null default current_timestamp comment '创建时间',
	`modify_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间', 
	`delete_flag` tinyint(3) not null default 0 comment '逻辑删除标记：0-未删除，1-已删除',
	primary key(`id`)
) comment = '员工表（理发师）';

create table user (
	`id` int(11) unsigned not null auto_increment comment 'ID',
	`phone` varchar(20) not null default '' comment '手机号',
	`name` varchar(50) not null default '' comment '员工姓名',
	`sex` tinyint(3) not null default 0 comment '性别：0-男，1-女',
	`money` double(16,8) not null default 0.0 comment '余额',
	`create_time` timestamp not null default current_timestamp comment '创建时间',
	`modify_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间', 
	`delete_flag` tinyint(3) not null default 0 comment '逻辑删除标记：0-未删除，1-已删除',
	primary key(`id`)
) comment = '用户表（会员）';


create table finance (
	`id` int(11) unsigned not null auto_increment comment 'ID',
	`user_id` int(11) not null default 0 comment '用户id',
	`order_id` int(11) not null default 0 comment '订单id',
	`type` tinyint(3) not null default 0 comment '变动类型：0-充值，1-消费，2-提现',
	`amount` double(16,8) not null default 0.0 comment '变动金额',
	`create_time` timestamp not null default current_timestamp comment '创建时间',
	`modify_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间', 
	`delete_flag` tinyint(3) not null default 0 comment '逻辑删除标记：0-未删除，1-已删除',
	primary key(`id`)
) comment = '资金流水表';

create table `order` (
	`id` int(11) unsigned not null auto_increment comment 'ID',
	`user_id` int(11) not null default 0 comment '用户id',
	`employee_id` int(11) not null default 0 comment '员工id',
	`product_id` tinyint(3) not null default 0 comment '消费产品id',
	`amount` double(16,8) not null default 0.0 comment '结算金额',
	`status` tinyint(3) not null default 0 comment '订单状态：0-创建，1-完成',
	`create_time` timestamp not null default current_timestamp comment '创建时间',
	`modify_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间', 
	`delete_flag` tinyint(3) not null default 0 comment '逻辑删除标记：0-未删除，1-已删除',
	primary key(`id`)
) comment = '订单表';

create table product (
	`id` int(11) unsigned not null auto_increment comment 'ID',
	`name` int(11) not null default 0 comment '产品名称',
	`price` int(11) not null default 0 comment '产品标价',
	`status` tinyint(3) not null default 0 comment '产品状态：0-正常，1-下架',
	`create_time` timestamp not null default current_timestamp comment '创建时间',
	`modify_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间', 
	`delete_flag` tinyint(3) not null default 0 comment '逻辑删除标记：0-未删除，1-已删除',
	primary key(`id`)
) comment = '产品表';


