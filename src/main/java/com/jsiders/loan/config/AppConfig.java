package com.jsiders.loan.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * Created by Sid Gaikwad on 29-05-2025.
 */
@Configuration
@EnableJpaAuditing
@OpenAPIDefinition(
        info = @Info(
                title = "Loan Microservice",
                description = "CRUD operations for Loan",
                version = "V1"
        )
)

public class AppConfig {
}
