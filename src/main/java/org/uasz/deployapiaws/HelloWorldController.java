package org.uasz.deployapiaws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/HelloWorld")
    public String helloWorld(){
        return "Hello World";
    }
}
