package com.lgh.chinasoft.developer.controller;

import com.lgh.chinasoft.developer.common.Response;
import com.lgh.chinasoft.developer.model.Project;
import com.lgh.chinasoft.developer.pojo.request.QueryProjectRequest;
import com.lgh.chinasoft.developer.service.ProjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/project")
@Api(tags = "project")
public class ProjectController {

    @Resource
    private ProjectService projectService;

    @ApiOperation("query project by developer account")
    @PostMapping(value = "/queryProjects",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Response<List<Project>> queryProjects(@RequestBody QueryProjectRequest request){
        if(StringUtils.isEmpty(request.getAccount())){
            return new Response<>("account can not be empty");
        }
        return new Response<>(projectService.queryByAccount(request));
    }
}
