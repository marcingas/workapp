package pl.marcindev.workapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import pl.marcindev.workapp.learning.Trainer;

@RestController
public class WorkController {

    private Trainer myTrainer;
//    private Trainer anotherTrainer;

    @Autowired
    public WorkController(@Qualifier("outsource") Trainer myTrainer
//                          ,@Qualifier("sportTrainer")Trainer anotherTrainer
                          ) {
        this.myTrainer = myTrainer;
//        this.anotherTrainer = anotherTrainer;
    }

    @Value("${director.name}")
    private String directorName;
    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Team name: " + teamName + ", director name: " + directorName;
    }

    @GetMapping("/start")
    public String start() {
        return "this is a starting point";
    }

    @GetMapping("/training")
    public String getDailyTraining() {
        return myTrainer.dailyWorkerTraining();
    }
//    @GetMapping("/check")
//    public String check(){
//        return "Comparing beans: myTrainer==anotherTrainer: " + (myTrainer==anotherTrainer);
//    }

}
