package pl.marcindev.workapp.learning;

import org.springframework.stereotype.Component;

@Component
public class BhpTrainer implements Trainer{
    @Override
    public String dailyWorkerTraining() {
        return "BHP training for new workers";
    }
}
