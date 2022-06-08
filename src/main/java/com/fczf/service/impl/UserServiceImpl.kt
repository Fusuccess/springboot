package com.fczf.service.impl

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.fczf.dao.UserDao
import com.fczf.entity.UserEntity
import com.fczf.service.UserService
import org.springframework.stereotype.Service

/**
 * UserServiceImpl
 * Create in 2022/6/8.
 * @author FuYuanxue fuc888@88.com
 */
@Service
class UserServiceImpl : ServiceImpl<UserDao, UserEntity>(), UserService {
  override fun getInfo(id: Long): UserEntity? {
    return baseMapper.selectById(id)
  }

  override fun getList(user: UserEntity): MutableList<UserEntity> {
    return baseMapper.selectList(QueryWrapper<UserEntity>()
        .like(!user.userName.isNullOrBlank(), "user_name", user.userName))
  }

  override fun update(user: UserEntity): Int {
    return baseMapper.updateById(user)
  }

  override fun delete(id: Long): Int {
    return baseMapper.deleteById(id)
  }

  override fun add(user: UserEntity): UserEntity {
    baseMapper.insert(user)
    return user
  }

}