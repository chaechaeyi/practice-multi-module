package com.practice.moduleapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(
        scanBasePackages = {"com.practice.moduleapi", "com.practice.moduleCommon"}
)
@EntityScan("com.practice.moduleCommon.domain")
@EnableJpaRepositories(basePackages = "com.practice.moduleCommon.repositories")
public class ModuleApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModuleApiApplication.class, args);
    }

}
