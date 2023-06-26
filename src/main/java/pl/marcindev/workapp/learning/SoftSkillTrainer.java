package pl.marcindev.workapp.learning;

import org.springframework.stereotype.Component;

@Component
public class SoftSkillTrainer implements Trainer {
    @Override
    public String dailyWorkerTraining() {
        return "Customer phone talk training";
    }
}
