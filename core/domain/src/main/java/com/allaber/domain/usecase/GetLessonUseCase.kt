package com.allaber.domain.usecase

import com.allaber.domain.model.Lesson
import com.allaber.domain.repository.ScheduleRepository
import javax.inject.Inject

class GetLessonUseCase @Inject constructor(private val repository: ScheduleRepository) {
    operator fun invoke(): List<Lesson> {
        return repository.getLessons()
    }
}
