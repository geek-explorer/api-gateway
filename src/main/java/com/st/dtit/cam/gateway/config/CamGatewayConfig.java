package com.st.dtit.cam.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CamGatewayConfig {

    @Bean
    public RouteLocator appRoutes(RouteLocatorBuilder builder){
         return builder.routes()
                       .route(p -> p
                            .path( "/api/v1/cam/authentication/**")
                            .uri("lb://cam-authentication")
                       )
                       .route(p -> p
                            .path( "/api/v1/cam/api-provisioning/**")
                            .uri("lb://cam-api-provisioning")
                       )
                       .route(p -> p
                             .path( "/api/cam/jwt-auth/**")
                             .uri("lb://cam-authentication")
                       )
                       .route(p -> p
                             .path( "/api/v1/cam/mail-service/**")
                             .uri("lb://cam-mail-service")
                       )
                       .route(p -> p
                               .path("/api/v1/cam/ap-fem-report/**")
                               .uri("lb://ap-fem-report-management")
                       )
                       .route(p -> p
                             .path( "/api/v1/cam-utility/wso-monitoring/**")
                             .uri("lb://wso-monitoring-service")
                       )
                       .route(p -> p
                             .path( "/api/ccer/locking-entry/**")
                             .uri("lb://ccer-locking-service")
                       )
                       .build();
    }
}
