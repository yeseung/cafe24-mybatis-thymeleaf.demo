package com.gongdaeoppa.cafe24mybatisthymeleaf.repository;


import com.gongdaeoppa.cafe24mybatisthymeleaf.domain.Test;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import java.util.List;

@Mapper
public interface TestRepository {

    //@Select("SELECT id, name FROM test ORDER BY ID DESC")
    List<Test> list();

    @Insert("INSERT INTO test (name) VALUES(#{name})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    Long insert(Test test);
}
