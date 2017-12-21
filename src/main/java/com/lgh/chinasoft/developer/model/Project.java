package com.lgh.chinasoft.developer.model;

import com.lgh.chinasoft.developer.common.ProjectType;
import com.lgh.chinasoft.developer.common.UrlType;

import java.io.Serializable;

/**
 * @author Administrator
 */
public class Project implements Serializable{
    private int id;
    private String account;
    private String name;
    private String url;
    private UrlType urlType;
    private ProjectType projectType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public UrlType getUrlType() {
        return urlType;
    }

    public void setUrlType(UrlType urlType) {
        this.urlType = urlType;
    }

    public ProjectType getProjectType() {
        return projectType;
    }

    public void setProjectType(ProjectType projectType) {
        this.projectType = projectType;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
