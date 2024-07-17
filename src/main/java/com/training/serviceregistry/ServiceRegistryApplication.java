package com.training.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryApplication {

  public static void main(String[] args) {
    SpringApplication.run(ServiceRegistryApplication.class, args);
  }

  @Bean
  public int example() {
    return 10;
  }
}
