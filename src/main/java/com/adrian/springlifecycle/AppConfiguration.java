package com.adrian.springlifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

  @Bean
  public LibraryManager libMan() {
    return new LibraryManager();
  }

  @Bean
  public BeanLoggerMonitor beanLoggerMonitor() {
    return new BeanLoggerMonitor();
  }
}
