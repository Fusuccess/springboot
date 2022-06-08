package com.fczf.dao

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.fczf.entity.UserEntity
import org.apache.ibatis.annotations.Mapper

/**
 * UserDao
 * Create in 2022/6/8.
 * @author FuYuanxue fuc888@88.com
 */
@Mapper
interface UserDao:BaseMapper<UserEntity> {
}