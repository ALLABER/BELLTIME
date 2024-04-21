package com.allaber.domain.usecase

import com.allaber.domain.model.Lesson
import com.allaber.domain.repository.ScheduleRepository
import javax.inject.Inject

class AddLessonUseCase @Inject constructor(private val repository: ScheduleRepository) {
    operator fun invoke(lesson: Lesson) {
        repository.addLesson(lesson = lesson)
    }
}
