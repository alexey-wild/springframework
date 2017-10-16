package com.KIM.TestJava.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/data")
public class DataController {
    @GetMapping
    public String uploadForm() {
        return "data";
    }
}
