package com.lgh.chinasoft.developer.service.impl;

import com.lgh.chinasoft.developer.dao.ProjectMapper;
import com.lgh.chinasoft.developer.model.Project;
import com.lgh.chinasoft.developer.pojo.request.QueryProjectRequest;
import com.lgh.chinasoft.developer.service.ProjectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@Service
public class ProjectServiceImpl implements ProjectService {

    @Resource
    private ProjectMapper projectMapper;

    @Override
    public List<Project> queryByAccount(QueryProjectRequest request) {
        return projectMapper.queryByAccount(request.getAccount(),request.pageFrom(),request.pageSize());
    }
}
