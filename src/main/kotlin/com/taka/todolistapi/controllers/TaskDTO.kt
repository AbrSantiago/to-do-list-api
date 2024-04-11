package com.taka.todolistapi.controllers

import com.taka.todolistapi.model.Task
import java.time.LocalDate

class TaskDTO(
    private val title: String,
    private val description: String?,
    private val expEndDate: LocalDate?
) {
    fun toModel(): Task {
        return Task(title, description, expEndDate)
    }
}