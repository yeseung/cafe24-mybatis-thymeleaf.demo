package com.gongdaeoppa.cafe24mybatisthymeleaf.controller;


import com.gongdaeoppa.cafe24mybatisthymeleaf.domain.Test;
import com.gongdaeoppa.cafe24mybatisthymeleaf.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

//    @PostConstruct
//    public void init() {
//        for (int i = 0; i < 2; i++) {
//            Test test = new Test();
//            test.setName("" + LocalDateTime.now() + " / " + UUID.randomUUID());
//            Long insert = testService.insert(test);
//            System.out.println("insert = " + insert);
//        }
//    }

    @GetMapping("/test")
    public String home(Model model){

        //새 글
        Test test = new Test();
        test.setName("" + LocalDateTime.now() + " / " + UUID.randomUUID());
        Long insert = testService.insert(test);
        System.out.println("insert = " + insert);


        List<Test> list = testService.list();
        model.addAttribute("list", list);
        return "test";

    }
}