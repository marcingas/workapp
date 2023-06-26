package pl.marcindev.workapp.learning;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ItTrainer implements Trainer{
    @Override
    public String dailyWorkerTraining() {
        return "It training";
    }
}
