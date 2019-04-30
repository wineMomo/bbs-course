CREATE TABLE `user` (
  `id` int(11) primary  key NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `userId` bigint(20) NOT NULL DEFAULT  0 COMMENT '学号/教工号',
  `username` varchar(64) NOT NULL DEFAULT '' COMMENT '用户名',
  `password` varchar(64) NOT NULL DEFAULT '' COMMENT '密码',
  `roles` varchar(8) NOT NULL DEFAULT '' COMMENT '角色',
  `college` varchar(32) NOT NULL DEFAULT  '' COMMENT '学院',
  `profession` varchar(32) NOT NULL DEFAULT '' COMMENT '班级',
  `createTime` datetime not null default  CURRENT_TIMESTAMP COMMENT '创建时间',
  `updateTime` datetime not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  UNIQUE KEY `userId` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

drop table course;
create  table `course`(
`id`    int(11) primary  key not null  AUTO_INCREMENT COMMENT '主键ID',
`courseName` varchar(32)  NOT NULL DEFAULT '' comment '课程名称',
`courseCollege`varchar(32) not null default '' comment '课程所属学院',
`courseTeacher` varchar(8) not null default  '' comment '任课老师',
`parentId`  int(11) not null default  0 comment '父id',
`deleted` tinyint(1) not null default 0 comment '是否删除，0 正常，1 删除',
`createTime` datetime not null default  CURRENT_TIMESTAMP COMMENT '创建时间',
`updateTime` datetime not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='课程表';

drop table if exists comment;
create table `comment`(
`id`  int(11) primary  key not null  AUTO_INCREMENT COMMENT '主键ID',
`userId` bigint(20) not null default 0 comment '用户id',
`commentContenet` text  not null  comment '评论内容',
`parentId` int(11) not null default  0 comment '父评论',
`deleted` tinyint(1) not null default 0 comment '是否删除，0正常，1删除',
`createTime` datetime not null default  CURRENT_TIMESTAMP COMMENT '创建时间',
`updateTime` datetime not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='评论表';

drop table  eventCount;
create table  `eventCount` (
`id` int(11) primary key not null AUTO_INCREMENT COMMENT '主键ID',
`commentCnt` int(11) not null default  0 comment '评论数量',
`pickCnt` int(11) not null default  0 comment '点赞数量',
`favoriteCnt` int(11) not null default  0 comment '收藏数量' ,
`searchCnt` int(11) not null default  0 comment '搜索次数',
`createTime` datetime not null default  CURRENT_TIMESTAMP COMMENT '创建时间',
`updateTime` datetime not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='统计表';

drop table if exists event;
create table `event`(
`id` int(11) primary key not null AUTO_INCREMENT COMMENT '主键ID',
`userId` bigint(20) not null default  0 comment '用户id',
`objId` int(11) not null default  0 comment '对象id',
`objType` tinyint(1) not null default 0 comment '事件对象类型，1-课程，2-评论',
`type`  int(4) not null default  0 comment '事件类型，1-关注，2-收藏，3-搜索，4-评论,5-点赞',
`deleted`tinyint(1) not null default 0 comment '是否删除，0正常，1删除',
`createTime` datetime not null default  CURRENT_TIMESTAMP COMMENT '创建时间',
`updateTime` datetime not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='事件表';



drop table if exists comment;
create table `comment_child`(
  `id`  int(11) primary  key not null  AUTO_INCREMENT COMMENT '主键ID',
  `userId` bigint(20) not null default 0 comment '用户id',
  `commentContenet` text  not null  comment '评论内容',
  `parentId` int(11) not null default  0 comment '父评论',
  `deleted` tinyint(1) not null default 0 comment '是否删除，0正常，1删除',
  `createTime` datetime not null default  CURRENT_TIMESTAMP COMMENT '创建时间',
  `updateTime` datetime not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='子评论表';







