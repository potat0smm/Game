package com.example.game.usecase

import com.example.game.entity.GameSettings
import com.example.game.entity.Questions
import com.example.game.repository.GameRepository

class GenerateQuestionUseCase(
    private val repository: GameRepository
){



    operator fun invoke(maxSumValues:Int):Questions{
        return repository.generateQuestion(maxSumValues, COUNT_OF_OPTIONS)
    }

    private companion object{

        private const val COUNT_OF_OPTIONS = 6
    }



}