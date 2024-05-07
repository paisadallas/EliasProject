package com.example.eliasproject.data

data class RespondApi (
    var total     : Int?            = null,
    var totalHits : Int?            = null,
    var hits      : ArrayList<Hit> = arrayListOf()
)