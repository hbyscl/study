package org.cheng.study.es.web.controller.dto;

/**
 * Created with Intellij IDEA 14.
 * User: chengli
 * Date: 2015/5
 * 默认注释
 */
public class PageInfoDto {
    private int page = 1;
    private int size = 100;
    private long totalCount;
    private long totalPage;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(long totalPage) {
        this.totalPage = totalPage;
    }
}
