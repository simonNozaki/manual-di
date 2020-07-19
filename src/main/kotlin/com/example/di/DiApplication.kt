package com.example.di

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(
		"com.example.di.service",
		"com.example.di.controller"
)
class DiApplication

fun main(args: Array<String>) {
	runApplication<DiApplication>(*args)
}
