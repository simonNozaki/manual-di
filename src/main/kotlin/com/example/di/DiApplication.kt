package com.example.di

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(
		"jp.co.netprotections.di.service",
		"jp.co.netprotections.di.controller"
)
class DiApplication

fun main(args: Array<String>) {
	runApplication<DiApplication>(*args)
}
