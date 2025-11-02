package com.example.kotlin_spring_boot_demo.controller

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    private val log = LoggerFactory.getLogger(HelloController::class.java)

    @GetMapping("/")
    fun sayHello(): String {
        log.info("Info Log Example")
        return "Hello from Kotlin!"
    }

    @GetMapping("/api/{name}")
    fun sayHelloByName(@PathVariable name: String): String {
        log.info("Info Log Example with name: $name")
        return "Hello, $name"
    }

}
