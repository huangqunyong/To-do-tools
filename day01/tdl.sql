drop table if exists `tdl`;
create table `tdl`(
	`id` int(11) not null auto_increment,
	`creation_time` datetime default current_timestamp,
	`details` varchar(1500),
	`starting_time` datetime,
	`ending_time` datetime,
	`priority` int(11),
	primary key(`id`)
);