CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `userId` bigint(20) NOT NULL DEFAULT  0 COMMENT '学号/教工号',
  `username` varchar(64) NOT NULL DEFAULT '' COMMENT '用户名',
  `password` varchar(64) NOT NULL DEFAULT '' COMMENT '密码',
  `roles` varchar(8) NOT NULL DEFAULT '' COMMENT '角色',
  `college` varchar(32) NOT NULL DEFAULT  '' COMMENT '学院',
  `profession` varchar(32) NOT NULL DEFAULT '' COMMENT '班级',
  PRIMARY KEY (`id`),
  UNIQUE KEY `userId` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表'