package com.example.di.configuration

import com.example.di.service.EntrepreneurService
import com.example.di.service.impl.MockEntrepreneurServiceImpl
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.context.annotation.Bean

/**
 * Junitテスト設定クラス
 */
@TestConfiguration
class TestConfiguration {

    @Bean
    @Qualifier(value = "MockEntrepreneurServiceImpl")
    fun getMockEntrepreneurServiceImpl(): EntrepreneurService {
        return MockEntrepreneurServiceImpl()
    }
}