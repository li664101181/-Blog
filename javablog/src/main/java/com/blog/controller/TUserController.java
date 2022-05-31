package com.blog.controller;


import com.blog.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 李昶
 * @since 2022-05-31
 */
@RestController
@RequestMapping("/t-user")
public class TUserController {
    @Autowired
    TUserService tUserService;
    @GetMapping("/{id}")
    public Object test(@PathVariable("id") Long id) {
        return tUserService.getById(id);
    }
}
