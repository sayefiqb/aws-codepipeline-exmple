package com.sayefiqbal.awscodepipelineexample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloWorldController {

    public String hello() {
        return "Hello World";
    }

}
