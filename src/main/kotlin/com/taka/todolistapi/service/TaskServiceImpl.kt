package com.taka.todolistapi.service

import com.taka.todolistapi.dao.TaskDAO
import com.taka.todolistapi.model.State
import com.taka.todolistapi.model.Task
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.time.LocalDate

@Service
@Transactional // No toy seguro si va o no
class TaskServiceImpl: TaskService {
    @Autowired private lateinit var dao: TaskDAO

    override fun create(title: String, description: String?, expEndDate: LocalDate?): Task {
        val newTask = Task(title, description, expEndDate)
        return dao.save(newTask)
    }

    override fun find(title: String): Task {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<Task> {
        TODO("Not yet implemented")
    }

    override fun delete(title: String) {
        TODO("Not yet implemented")
    }

    override fun changeState(title: String, newState: State): Task {
        TODO("Not yet implemented")
    }
}