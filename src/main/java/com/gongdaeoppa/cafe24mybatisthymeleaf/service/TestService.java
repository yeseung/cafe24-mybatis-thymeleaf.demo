package com.gongdaeoppa.cafe24mybatisthymeleaf.service;

import com.gongdaeoppa.cafe24mybatisthymeleaf.domain.Test;
import com.gongdaeoppa.cafe24mybatisthymeleaf.mapper.TestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService implements TestMapper {

    private final TestMapper testMapper;

    @Override
    public List<Test> list() {
        return testMapper.list();
    }

    @Override
    public Long insert(Test test) {
        testMapper.insert(test);
        return test.getId();
    }
}
