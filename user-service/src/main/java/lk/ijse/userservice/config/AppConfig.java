package lk.ijse.userservice.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ModelMapper modelMapper() {

        ModelMapper modelMapper = new ModelMapper();

        if (modelMapper == null) {
            System.out.println("ModelMapper is null");
        }
        return modelMapper;
    }
}