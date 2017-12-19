package com.lgh.chinasoft.developer.controller;

import com.lgh.chinasoft.developer.model.User;
import com.lgh.chinasoft.developer.pojo.request.QueryUserRequest;
import com.lgh.chinasoft.developer.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/user")
@Api(tags = "user")
public class UserController {

    @Resource
    private UserService userService;

    @ApiOperation("查询用户信息")
    @PostMapping(value = "/queryUsers",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<User> queryUsers(@RequestBody QueryUserRequest request){
        return userService.queryUsers(request);
    }


}
