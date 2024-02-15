package com.example.kisileruygulamasi.data.datasource

import android.util.Log
import com.example.kisileruygulamasi.data.entity.Kisiler
import com.example.kisileruygulamasi.retrofit.KisilerDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class KisilerDataSource(var kisilerDao: KisilerDao) {

    suspend fun kisileriYukle() : List<Kisiler> =
        withContext(Dispatchers.IO){
            return@withContext kisilerDao.kisileriYukle().kisiler
        }

    suspend fun ara(aramaKelimesi:String): List<Kisiler> =
        withContext(Dispatchers.IO){

            return@withContext kisilerDao.ara(aramaKelimesi).kisiler
        }

    suspend fun kaydet(kisi_ad: String, kisi_tel: String) = kisilerDao.kaydet(kisi_ad, kisi_tel)
    suspend fun guncelle(kisi_id:Int,kisi_ad:String,kisi_tel:String) = kisilerDao.guncelle(kisi_id,kisi_ad,kisi_tel)
    suspend fun sil(kisi_id:Int) = kisilerDao.sil(kisi_id)

}