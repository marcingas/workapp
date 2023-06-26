package pl.marcindev.workapp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.marcindev.workapp.learning.OutsourcingTrainer;
import pl.marcindev.workapp.learning.Trainer;

@Configuration
public class OutsourcingConfig {
    @Bean("outsource")
    public Trainer outsourcingTrainer(){
        return new OutsourcingTrainer();
    }
}
