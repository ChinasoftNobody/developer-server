package com.lgh.chinasoft.developer.dao;

import com.lgh.chinasoft.developer.model.Developer;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Administrator
 */
@Repository
public interface DeveloperMapper {

    /**
     * query users by keyword
     * @param keyword keyword:name,account,email
     * @param from from
     * @param size size
     * @return users
     */
    List<Developer> queryUsers(@Param("keyword") String keyword, @Param("from") int from, @Param("size") int size);
}
