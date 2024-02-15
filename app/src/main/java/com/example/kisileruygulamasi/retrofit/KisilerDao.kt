package com.example.kisileruygulamasi.retrofit

import com.example.kisileruygulamasi.data.entity.KisilerCevap
import retrofit2.http.GET

interface KisilerDao {
    //http://kasimadalan.pe.hu/ base_url
    //kisiler/tum_kisiler.php   webservis url

    @GET("kisiler/tum_kisiler.php")
    suspend fun kisileriYukle() : KisilerCevap
}