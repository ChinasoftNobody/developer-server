package com.lgh.chinasoft.developer.service.impl;

import com.lgh.chinasoft.developer.dao.MUserMapper;
import com.lgh.chinasoft.developer.model.User;
import com.lgh.chinasoft.developer.pojo.request.QueryUserRequest;
import com.lgh.chinasoft.developer.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private MUserMapper userMapper;

    @Override
    public List<User> queryUsers(QueryUserRequest request) {
        return userMapper.queryUsers("%" + request.getKeyword() + "%", request.pageFrom(), request.pageSize());
    }
}
