package com.lgh.chinasoft.developer.common;

/**
 * page model
 * @author Administrator
 */
public class Page implements Pageable {
    private int pageSize;

    private int pageNumber;

    public Page() {
    }

    public Page(int pageSize, int pageNumber) {
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
    }

    @Override
    public int pageSize() {
        return pageSize;
    }

    @Override
    public int pageNumber() {
        return pageNumber;
    }

    @Override
    public int pageFrom() {
        return (pageNumber - 1)*pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}
