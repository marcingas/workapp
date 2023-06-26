package pl.marcindev.workapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkController {
    @GetMapping("/start")
    public String start(){
        return "this is a starting point";
    }

}
