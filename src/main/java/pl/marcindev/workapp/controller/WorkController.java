package pl.marcindev.workapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class WorkController {
    @Value("${director.name}")
    private String directorName;
    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Team name: " + teamName + ", director name: " + directorName;
    }
    @GetMapping("/start")
    public String start(){
        return "this is a starting point";
    }

}
