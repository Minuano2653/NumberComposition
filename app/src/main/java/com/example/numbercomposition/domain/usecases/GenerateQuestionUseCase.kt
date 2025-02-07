package com.example.numbercomposition.domain.usecases

import com.example.numbercomposition.domain.entities.Question
import com.example.numbercomposition.domain.repositories.GameRepository

class GenerateQuestionUseCase(
    private val repository: GameRepository
) {
    operator fun invoke(maxSumValue: Int): Question {
        return repository.generateQuestion(maxSumValue, COUNT_OF_OPTIONS)
    }

    companion object {
        private const val COUNT_OF_OPTIONS = 6
    }
}