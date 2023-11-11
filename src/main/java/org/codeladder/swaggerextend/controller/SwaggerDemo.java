package org.codeladder.swaggerextend.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @author: xuefei
 * @create 2023/11/8 23:15:00
 */
@RestController
@RequestMapping("/api")
public class SwaggerDemo {

    @Operation(summary = "Get a greeting message")
    @GetMapping("/hello")
    public String hello() {
        return "Hello, Swagger with only the Swagger library!";
    }
}
