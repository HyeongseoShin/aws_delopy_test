package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "EC2 접속 성공! 서버가 살아있습니다.";
    }

    @GetMapping("/CDTest")
    public String CDTest() {
        return "CD 성공!! 수고하셨습니다.";
    }

    @GetMapping("/cicd-docker")
    public String dockerTest() {
        return "도커 이미지 CI/CD 성공!! 수고하셨습니다.";
    }
}