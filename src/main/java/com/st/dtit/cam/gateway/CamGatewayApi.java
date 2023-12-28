package com.st.dtit.cam.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CamGatewayApi {

        public static void main(String[] args) {
        SpringApplication.run(CamGatewayApi.class, args);
    }

}
