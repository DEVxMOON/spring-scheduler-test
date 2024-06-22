package com.hr.scheduler.swagger

import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SwaggerConfig {

    @Bean
    fun swaggerApi(): OpenAPI = OpenAPI()
        .components(Components())
        .info(Info()
            .title("Spring Scheduler Test")
            .description("Test Scheduler")
            .version("1.0.0"))
}