package com.fczf.controller

import com.fczf.entity.UserEntity
import com.fczf.service.UserService
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*

/**
 * UserController
 * Create in 2022/6/8.
 * @author FuYuanxue fuc888@88.com
 */
@RestController
@RequestMapping("/user")
class UserController(private val userService: UserService) {
  companion object {
    private val logger = LoggerFactory.getLogger(UserController::class.java)
  }

  @PutMapping("/add")
  fun add(@RequestBody userEntity: UserEntity) = userService.add(userEntity)

  @DeleteMapping("/delete")
  fun delete(id: Long) = userService.delete(id)

  @PostMapping("/update")
  fun update(@RequestBody userEntity: UserEntity) = userService.update(userEntity)

  @GetMapping("/list")
  fun list(@RequestBody userEntity: UserEntity) = userService.getList(userEntity)

  @GetMapping("/info")
  fun info(id: Long) = userService.getInfo(id)

}