package io.mercedesbenz.springio.adminclientautodb;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTaskExample {

    @Scheduled(fixedRate=1000)
    public void pin(){
        System.out.println("pong");
    }
}
