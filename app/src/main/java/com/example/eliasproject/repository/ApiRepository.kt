package com.example.eliasproject.repository

import com.example.eliasproject.data.RespondApi
import retrofit2.Response

interface ApiRepository {

    fun getImages(): Response<RespondApi>

}