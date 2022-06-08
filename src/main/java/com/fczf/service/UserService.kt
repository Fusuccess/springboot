package com.fczf.service

import com.baomidou.mybatisplus.extension.service.IService
import com.fczf.entity.UserEntity

/**
 * UserService
 * Create in 2022/6/8.
 * @author FuYuanxue fuc888@88.com
 */
interface UserService : IService<UserEntity> {
  fun getInfo(id: Long): UserEntity?

//  fun getList(): MutableList<UserEntity>

  fun update(user: UserEntity): Int

  fun delete(id:Long): Int

  fun add(user: UserEntity): UserEntity

  fun getList(user: UserEntity): MutableList<UserEntity>

}