package com.allaber.domain.usecase

import com.allaber.domain.model.Lesson
import com.allaber.domain.repository.ScheduleRepository
import javax.inject.Inject

class EditLessonUseCase @Inject constructor(private val repository: ScheduleRepository) {
    operator fun invoke(lesson: Lesson) {
        repository.editLesson(lesson = lesson)
    }
}
