package com.lgh.chinasoft.developer.dao;

import com.lgh.chinasoft.developer.model.Project;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Administrator
 */
@Repository
public interface ProjectMapper {

    /**
     * query project by developer account
     * @param account account
     * @param from from
     * @param size size
     * @return projects
     */
    List<Project> queryByAccount(@Param("account") String account,@Param("from") int from, @Param("size") int size);
}
