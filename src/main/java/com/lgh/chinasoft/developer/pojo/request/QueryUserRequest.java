package com.lgh.chinasoft.developer.pojo.request;

import com.lgh.chinasoft.developer.common.Page;

/**
 * @author Administrator
 */
public class QueryUserRequest extends Page{
    private String keyword;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
