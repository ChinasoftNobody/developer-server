package com.lgh.chinasoft.developer.service;

import com.lgh.chinasoft.developer.model.Project;
import com.lgh.chinasoft.developer.pojo.request.QueryProjectRequest;

import java.util.List;

/**
 * @author Administrator
 */
public interface ProjectService {

    /**
     * query by account
     * @param request request
     * @return projects
     */
    List<Project> queryByAccount(QueryProjectRequest request);
}
