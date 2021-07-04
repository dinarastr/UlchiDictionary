package com.example.ulchidictionary.data

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "russian_to_nanay")
data class RussianWord(
    @PrimaryKey
    var russian: String = "",
    var ab: String?,
    var bc: String?,
    var cd: String?,
    var de: String?,
    var ef: String?,
    var fg: String?,
    var gh: String?,
    var hi: String?,
    var ij: String?,
    var jk: String?,
    var kl: String?,
    var lm: String?,
    var mn: String?,
    var no: String?,
    var op: String?,
    var pq: String?,
    var qr: String?,
    var rs: String?,
    var st: String?,
    var tu: String?,
    var uv: String?,
    var vw: String?,
    var wx: String?,
    var xy: String?,
    var yz: String?,
    var za: String?,
    var ba: String?,
    var cb: String?,
    var dc: String?,
    var fd: String?,
    var fe: String?,
    var ed: String?,
    var gf: String?,
    var hg: String?,
    var ih: String?,
    var ji: String?,
    var kj: String?,
    var lk: String?,
    var ml: String?,
    var nm: String?,
    var on: String?,
    var po: String?
)