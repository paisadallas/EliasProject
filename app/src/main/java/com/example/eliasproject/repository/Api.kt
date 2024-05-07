package com.example.eliasproject.repository

import com.example.eliasproject.data.RespondApi
import retrofit2.Response
import retrofit2.http.GET

interface Api {


    @GET("")
    fun getApi(): Response<RespondApi>

    companion object {
        val BASE_URL = "https://pixabay.com/api"
    }
}