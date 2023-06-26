package pl.marcindev.workapp.learning;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SportTrainer implements Trainer {
    @Override
    public String dailyWorkerTraining() {
        return "Training for workers";
    }
}
