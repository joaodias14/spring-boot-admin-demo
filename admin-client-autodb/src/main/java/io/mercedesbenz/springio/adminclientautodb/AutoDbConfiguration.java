package io.mercedesbenz.springio.adminclientautodb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@Configuration
public class AutoDbConfiguration {

    @Bean
   public ThreadPoolTaskScheduler threadPoolTaskScheduler(){
       ThreadPoolTaskScheduler threadPoolTaskScheduler = new ThreadPoolTaskScheduler();
       threadPoolTaskScheduler.setPoolSize(10);
       threadPoolTaskScheduler.setThreadNamePrefix("ThreadPoolTaskScheduler");
       return threadPoolTaskScheduler;
   }
}
