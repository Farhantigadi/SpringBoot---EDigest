package Edigest.First.Springboot.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {
    @GetMapping("hello")
    public String sayhello() {
        return "Hello";
    }

    @Autowired
    Engine engine;

    @GetMapping("hello/eng")
    public String eng() {
        return engine.func();
    }

}
