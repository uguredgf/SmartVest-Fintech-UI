package com.garantibbva.smartvest

data class Portfolio(
    val totalBalance: Double,
    val goldAmount: Double,
    val fundAmount: Double,
    val cryptoAmount: Double,
    val insightMessage: String
)
