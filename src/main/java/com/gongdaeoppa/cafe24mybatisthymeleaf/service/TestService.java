package com.gongdaeoppa.cafe24mybatisthymeleaf.service;

import com.gongdaeoppa.cafe24mybatisthymeleaf.domain.Test;
import com.gongdaeoppa.cafe24mybatisthymeleaf.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService implements TestRepository {

    private final TestRepository testRepository;

    @Override
    public List<Test> list() {
        return testRepository.list();
    }

    @Override
    public Long insert(Test test) {
        testRepository.insert(test);
        return test.getId();
    }
}
