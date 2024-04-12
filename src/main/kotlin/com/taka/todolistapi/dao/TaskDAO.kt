package com.taka.todolistapi.dao

import com.taka.todolistapi.model.Task
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface TaskDAO: MongoRepository<Task, String> {
    fun findByTitle(title: String): Task
}