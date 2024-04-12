package com.taka.todolistapi.controllers

import com.taka.todolistapi.model.State
import com.taka.todolistapi.model.Task
import java.time.LocalDate

class TaskDTO(
    val title: String,
    val description: String?,
    val state: State?,
    val creationDate: LocalDate?,
    val expEndDate: LocalDate?,
    val endDate: LocalDate?
) {
    fun toModel(): Task {
        return Task(title, description, expEndDate)
    }

    companion object {
        fun fromModel(task: Task) = TaskDTO(
            title = task.title,
            description = task.description,
            state = task.state,
            creationDate = task.creationDate,
            expEndDate = task.expEndDate,
            endDate = task.endDate
        )
    }
}