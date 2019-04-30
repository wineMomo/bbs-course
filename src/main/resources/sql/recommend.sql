create table recommend (
`id` int(11) primary  key NOT NULL AUTO_INCREMENT COMMENT '主键ID',
`userId` bigint(20) NOT NULL DEFAULT  0 COMMENT '学号/教工号',
`courseId`  int(11)   NOT NULL DEFAULT  0  COMMENT '课程id',
`commentId` int(11)   NOT NULL DEFAULT  0  COMMENT '课程id',
`deleted` tinyint(1) not null default 0 comment '是否删除，0 正常，1 删除',
`createTime` datetime not null default  CURRENT_TIMESTAMP COMMENT '创建时间',
`updateTime` datetime not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
 UNIQUE KEY `userId` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';


