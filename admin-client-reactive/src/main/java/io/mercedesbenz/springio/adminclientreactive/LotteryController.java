package io.mercedesbenz.springio.adminclientreactive;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.Random;

@RestController
public class LotteryController {
    
    private static final Logger LOG = LoggerFactory.getLogger(LotteryController.class);
    
    @GetMapping("/make-me-rich")
    Flux<Integer> makeMeRich() {
        int data = new Random().nextInt();
        LOG.info("you're rich: " + data);
        return Flux.just(data);
    }
    
    @GetMapping("/raffle")
    Flux<Integer> raffle() {
        int data = new Random().nextInt();
        LOG.warn("And the number is: " + data);
        return Flux.just(data);
    }
}
