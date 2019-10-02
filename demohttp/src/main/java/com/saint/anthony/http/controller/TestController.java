package com.saint.anthony.http.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin // створювати запити з одного сервера на інший
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping // два однакових метода з однаковим урл не може бути
    public String getTest() {
        return "<b>Test</b>"; // connect to localhost:8080/test
    }
}
