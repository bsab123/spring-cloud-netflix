package org.caps.provider.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.caps.provider.domain.User;
import org.caps.provider.service.UserService;
import org.caps.provider.vo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserService userService;

    @GetMapping(value = "memberData/{pageNo}/{pageSize}")
    public Result<?> getUserListPageInfo(User user, @PathVariable Integer pageNo ,@PathVariable Integer pageSize){
        Page<User> page=new Page<>(pageNo,pageSize);
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        IPage<User> pageList = userService.page(page, queryWrapper);
        return Result.ok(pageList);
    }
}
