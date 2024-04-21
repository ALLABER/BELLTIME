package com.allaber.domain.usecase

import com.allaber.domain.repository.ScheduleRepository
import javax.inject.Inject

class DeleteLessonUseCase @Inject constructor(private val repository: ScheduleRepository) {
    operator fun invoke(lessonId: Int) {
        repository.deleteLesson(lessonId = lessonId)
    }
}
