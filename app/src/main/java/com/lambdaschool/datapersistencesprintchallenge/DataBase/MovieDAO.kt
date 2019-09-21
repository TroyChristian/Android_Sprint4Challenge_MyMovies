package com.lambdaschool.datapersistencesprintchallenge.DataBase

import androidx.room.Dao
import androidx.room.Query

@Dao
interface MovieDAO{
    @Query("SELECT title FROM favorite_movies WHERE title like :search ")
    fun getMovieByName(search:String)



}