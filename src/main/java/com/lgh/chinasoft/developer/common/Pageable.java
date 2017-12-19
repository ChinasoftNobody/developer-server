package com.lgh.chinasoft.developer.common;

/**
 * 分页接口
 * @author Administrator
 */
public interface Pageable {
    /**
     * @return pageSize
     */
    int pageSize();

    /**
     * pageNumber start with 1
     * @return pageNumber
     */
    int pageNumber();

    /**
     * from
     * @return from
     */
    int pageFrom();
}
