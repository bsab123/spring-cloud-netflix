package org.caps.provider.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.ApiOperation;
import org.caps.provider.domain.UmsMember;
import org.caps.provider.service.UmsMemberService;
import org.caps.provider.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UmsMemberController {

    @Autowired
    private UmsMemberService umsMemberService;


    @ApiOperation(value = "用户分页查询", notes = "用户分页查询")
    @RequestMapping(value = "memberData/{pageNo}/{pageSize}", method = RequestMethod.GET)
    public Result<?> sayHi(UmsMember umsMember, @PathVariable Integer pageNo, @PathVariable Integer pageSize, HttpServletRequest request) {
        Page<UmsMember> page = new Page<UmsMember>(pageNo, pageSize);
        QueryWrapper<UmsMember> queryWrapper = new QueryWrapper<>();
        IPage<UmsMember> memberData = umsMemberService.page(page, queryWrapper);
        return Result.ok(memberData);
    }
}