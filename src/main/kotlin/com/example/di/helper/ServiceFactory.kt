package com.example.di.helper

import com.example.di.service.EntrepreneurService

/**
 * サービスファクトリクラス
 */
class ServiceFactory private constructor(){

    /**
     * ファクトリシングルトン
     */
    companion object {

        fun <T: EntrepreneurService> getEntrepreneurService(type: Class<T>): T {
            return type.getDeclaredConstructor().newInstance()
        }

    }


}