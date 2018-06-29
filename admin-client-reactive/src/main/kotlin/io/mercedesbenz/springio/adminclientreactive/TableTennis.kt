package io.mercedesbenz.springio.adminclientreactive

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux


@RestController
class TableTennis {

    val LOG = LoggerFactory.getLogger(TableTennis::class.java)

    @GetMapping("/ping")
    fun ping(): Flux<String> {
        LOG.info("ping")
        return Flux.just("pong")
    }

    @GetMapping("/pong")
    fun pong(): Flux<String> {
        LOG.warn("pong")
        return Flux.just("ping")
    }
}
