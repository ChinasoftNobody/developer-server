package com.lgh.chinasoft.developer.dao;

import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    @Select("SELECT 1 FROM user")
    int test();
}
