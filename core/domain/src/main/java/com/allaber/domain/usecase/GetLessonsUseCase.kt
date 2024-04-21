package com.allaber.domain.usecase

import com.allaber.domain.model.Lesson
import com.allaber.domain.repository.ScheduleRepository
import javax.inject.Inject

class GetLessonsUseCase @Inject constructor(private val repository: ScheduleRepository) {
    operator fun invoke(lessonId: Int): Lesson {
        return repository.getLesson(lessonId = lessonId)
    }
}
