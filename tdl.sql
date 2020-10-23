drop table if exists `tdl`;
create table `tdl`(
	`id` int(11) not null auto_increment ,
	`creation_time` timestamp default current_timestamp comment '创建时间' ,
	`details` text default null comment '详细事情' ,
	`starting_time` datetime default null comment '起始时间' ,
	`ending_time` datetime default null comment '结束时间' ,
	`priority` int(11) default 0 comment '优先级' ,
	primary key(`id`)
);