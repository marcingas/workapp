package pl.marcindev.workapp.learning;

import org.springframework.stereotype.Component;

@Component
public class SportTrainer implements Trainer {
    @Override
    public String dailyWorkerTraining() {
        return "Training for workers";
    }
}
