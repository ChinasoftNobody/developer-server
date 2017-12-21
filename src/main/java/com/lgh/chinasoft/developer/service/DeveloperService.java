package com.lgh.chinasoft.developer.service;

import com.lgh.chinasoft.developer.model.Developer;
import com.lgh.chinasoft.developer.pojo.request.QueryDeveloperRequest;

import java.util.List;

/**
 * @author Administrator
 */
public interface DeveloperService {
    /**
     * getUserInfo
     * @param request request
     * @return users
     */
    List<Developer> queryDevelopers(QueryDeveloperRequest request);
}
