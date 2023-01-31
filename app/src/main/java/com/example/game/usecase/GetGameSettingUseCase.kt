package com.example.game.usecase

import com.example.game.entity.GameSettings
import com.example.game.entity.Level
import com.example.game.repository.GameRepository

class GetGameSettingUseCase (

    private val repository: GameRepository
        ){

    operator fun invoke(level:Level): GameSettings{
        return repository.getGameSettings(level)
    }


}