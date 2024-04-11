package com.taka.todolistapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate

@Document("Task")
class Task(var title: String, var description: String?, var expEndDate: LocalDate?) {
    @Id
    var id: String? = null
    var state = State.TO_DO
    var creationDate: LocalDate = LocalDate.now()
    lateinit var endDate: LocalDate

    init {
        validateTitle()
    }

    private fun validateTitle() {
        if(this.title.isBlank()) {
            throw EmptyTitleException()
        }
    }
}