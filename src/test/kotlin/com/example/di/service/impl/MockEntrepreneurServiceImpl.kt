package com.example.di.service.impl

import com.example.di.service.EntrepreneurService
import org.springframework.stereotype.Service

@Service(value = "MockEntrepreneurServiceImpl")
class MockEntrepreneurServiceImpl : EntrepreneurService {

    override fun printEntrepreneur(): String {
        println("this is mock service")

        return "MockEntrepreneurServiceImpl"
    }
}