package com.lgh.chinasoft.developer.controller;

import com.lgh.chinasoft.developer.common.Response;
import com.lgh.chinasoft.developer.model.Developer;
import com.lgh.chinasoft.developer.pojo.request.QueryDeveloperRequest;
import com.lgh.chinasoft.developer.service.DeveloperService;
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
@RequestMapping("/developer")
@Api(tags = "developer")
public class DeveloperController {

    @Resource
    private DeveloperService developerService;

    @ApiOperation("查询用户信息")
    @PostMapping(value = "/queryDevelopers",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Response<List<Developer>> queryDevelopers(@RequestBody QueryDeveloperRequest request){
        List<Developer> developers = developerService.queryDevelopers(request);
        return new Response<>(developers);
    }


}
