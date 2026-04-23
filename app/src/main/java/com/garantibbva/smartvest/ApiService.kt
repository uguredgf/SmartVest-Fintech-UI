package com.garantibbva.smartvest

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiService {
    @GET("portfolio")
    fun getPortfolio(): Call<Portfolio>

    @POST("invest")
    fun invest(
        @Query("amount") amount: Int,
        @Query("risk") risk: Int
    ): Call<Void>
}
