package com.lambdaschool.datapersistencesprintchallenge.DataBase

import androidx.room.Dao
import androidx.room.Query

@Dao
interface MovieDAO{
    @Query("SELECT * FROM favorite_movies")
    fun getAllFavoriteMovies()

}