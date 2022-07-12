package com.lux.zena.tp02.model

data class ResponsePw(
    val status:String,
    val message:String,
    val path:String,
    val data:Data,
){
    data class Data(
        val userUUID:String
    )
}
