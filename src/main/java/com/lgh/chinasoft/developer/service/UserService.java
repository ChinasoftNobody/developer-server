package com.lgh.chinasoft.developer.service;

import com.lgh.chinasoft.developer.model.User;
import com.lgh.chinasoft.developer.pojo.request.QueryUserRequest;

import java.util.List;

/**
 * @author Administrator
 */
public interface UserService {
    /**
     * getUserInfo
     * @param request request
     * @return users
     */
    List<User> queryUsers(QueryUserRequest request);
}
