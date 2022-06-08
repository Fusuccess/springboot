CREATE TABLE `sys_user` (
                            `user_id` bigint(255) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
                            `user_name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '姓名',
                            `phone` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '电话',
                            `gender` int(2) DEFAULT NULL COMMENT '性别',
                            `address` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '地址',
                            `email` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '邮箱',
                            `password` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '密码',
                            `status` int(2) NOT NULL DEFAULT '0' COMMENT '状态  0:正常  1:冻结',
                            `post` int(2) DEFAULT NULL COMMENT '身份  0:普通用户 1:vip用户',
                            `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                            `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                            PRIMARY KEY (`user_id`)
)