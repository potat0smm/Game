package com.example.game.repository

import com.example.game.entity.GameSettings
import com.example.game.entity.Level
import com.example.game.entity.Questions

interface GameRepository {

fun generateQuestion(
    maxSemValue:Int,
    countOfOptions: Int
): Questions

fun getGameSettings(level: Level): GameSettings

}