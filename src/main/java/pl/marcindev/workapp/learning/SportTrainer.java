package pl.marcindev.workapp.learning;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SportTrainer implements Trainer {
//    @PostConstruct
//    public void doMyStartupStuff(){
//        System.out.println("Im upgrading my Sport Trainer");
//    }
//    @PreDestroy
//    public void doMyCleanupStuff(){
//        System.out.println("Im cleaning...");
//    }

    @Override
    public String dailyWorkerTraining() {
        return "Training for workers";
    }
}
