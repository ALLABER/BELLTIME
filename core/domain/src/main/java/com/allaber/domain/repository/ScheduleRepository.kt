package com.allaber.domain.repository

import com.allaber.domain.model.Lesson

interface ScheduleRepository {
    fun getLessons(): List<Lesson>
    fun getLesson(lessonId: Int): Lesson
    fun addLesson(lesson: Lesson)
    fun editLesson(lesson: Lesson)
    fun deleteLesson(lessonId: Int)
}
