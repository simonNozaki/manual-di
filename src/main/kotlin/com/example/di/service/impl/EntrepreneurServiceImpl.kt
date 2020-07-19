package jp.co.netprotections.di.service.impl

import com.example.di.service.EntrepreneurService
import org.springframework.stereotype.Service

@Service(value = "EntrepreneurServiceImpl")
class EntrepreneurServiceImpl : EntrepreneurService {

    private val entrepreneurs: List<String> = listOf("Eron Musk", "Mark Zackerberg", "Jeff Bezos")

    override fun printEntrepreneur(): String {
        entrepreneurs.forEach { println(it) }

        return "EntrepreneurServiceImpl"
    }
}