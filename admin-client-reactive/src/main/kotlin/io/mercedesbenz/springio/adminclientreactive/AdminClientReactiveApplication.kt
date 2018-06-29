package io.mercedesbenz.springio.adminclientreactive

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AdminClientReactiveApplication

fun main(args: Array<String>) {
    runApplication<AdminClientReactiveApplication>(*args)
}
