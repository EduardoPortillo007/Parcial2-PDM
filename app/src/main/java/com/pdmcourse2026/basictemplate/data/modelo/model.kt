package com.pdmcourse2026.basictemplate.data.modelo

data class Option(
    val id: Int,
    val imageURL: String,
    val name: String,
    val votes: Int
)

data class Error(
    val message: String,
    val ok: Boolean
)