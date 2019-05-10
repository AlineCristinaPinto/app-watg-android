package br.com.dtidigital.whoarethoseguys.retrofit.service

import br.com.dtidigital.whoarethoseguys.model.entities.Tribo
import retrofit2.Call
import retrofit2.http.GET

interface TriboService{

    @GET("/api/v1/tribos")
    fun listaTribos() : Call<List<Tribo>>

}