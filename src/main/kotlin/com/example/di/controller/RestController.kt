package com.example.di.controller

import com.example.di.service.EntrepreneurService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class RestController (private val entrepreneurService: EntrepreneurService) {

    @RequestMapping(value = ["/"], method = [RequestMethod.GET])
    fun execute(): String = entrepreneurService.printEntrepreneur()
}