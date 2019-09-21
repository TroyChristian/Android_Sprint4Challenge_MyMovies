package com.lambdaschool.datapersistencesprintchallenge.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favorite_movies")
data class FavoriteMovie(
    @PrimaryKey
    val id:String,
    val title:String,
    val release_date:String,
    var isFavorite:Boolean)