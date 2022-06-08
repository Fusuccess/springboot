package com.fczf.entity

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.time.LocalDateTime

/**
 * UserEntity
 * Create in 2022/6/8.
 * @author FuYuanxue fuc888@88.com
 */
@TableName("sys_user")
data class UserEntity(

    @TableId("user_id", type = IdType.INPUT)
    var userId: Long? = null,
    var userName: String? = null,
    var gender: String? = null,
    var phone: String? = null,
    var address: String? = null,
    var email: String? = null,
    var password: String? = null,
    var status: Int? = null,
    var post: Int? = null,
    var createTime: LocalDateTime? = null,
    var updateTime: LocalDateTime? = null

)