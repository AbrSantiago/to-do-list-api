package com.taka.todolistapi.service

import com.taka.todolistapi.model.State
import com.taka.todolistapi.model.Task
import java.time.LocalDate

interface TaskService {
    fun create(title: String, description: String?, expEndDate: LocalDate?): Task
    fun find(title: String): Task
    fun findAll(): List<Task>
    fun delete(title: String)
    fun changeState(title: String, newState: State): Task
}

// Y qué pasa si hago fun create(task: Task): Task ?
// RE: Según Franquito da lo mismo