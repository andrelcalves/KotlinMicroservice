package com.example.microservicekotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MicroServiceKotlinApplication

fun main(args: Array<String>) {
    runApplication<MicroServiceKotlinApplication>(*args)
}
