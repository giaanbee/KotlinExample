package dev.nqhuy.kotlin.book/* * Created by Chang Bee on 6/2/2017. * * Khai báo 1 Objct bao hàm cả getter and setter */class Artist(        var id: Long,        var name: String,        var url: String,        var mobile: String) {    fun print(){        println("id: $id name: $name url: $url mobile: $mobile")    }}