package com.lgh.chinasoft.developer.service.impl;

import com.lgh.chinasoft.developer.dao.DeveloperMapper;
import com.lgh.chinasoft.developer.model.Developer;
import com.lgh.chinasoft.developer.pojo.request.QueryDeveloperRequest;
import com.lgh.chinasoft.developer.service.DeveloperService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@Service
public class DeveloperServiceImpl implements DeveloperService {
    @Resource
    private DeveloperMapper userMapper;

    @Override
    public List<Developer> queryDevelopers(QueryDeveloperRequest request) {
        return userMapper.queryUsers("%" + request.getKeyword() + "%", request.pageFrom(), request.pageSize());
    }
}
