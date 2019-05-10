package br.com.dtidigital.whoarethoseguys.retrofit

import br.com.dtidigital.whoarethoseguys.retrofit.service.TriboService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInitializer {

    private val retroft = Retrofit.Builder()
                                .baseUrl("https://api-tribos-watg.herokuapp.com")
                                .addConverterFactory(GsonConverterFactory.create())
                                .build()


    fun triboService() = retroft.create(TriboService::class.java)
}