package com.taka.todolistapi.controllers

import com.taka.todolistapi.service.TaskService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@CrossOrigin
@RestController
@RequestMapping("/task")
class TaskController(private val taskService: TaskService) {
    @PostMapping
    fun create(@RequestBody taskDTO: TaskDTO): ResponseEntity<String> {
        return try {
            val task = taskDTO.toModel()
            taskService.create(task.title, task.description, task.expEndDate)
            ResponseEntity.ok("Task created succesfully")
        } catch (e: Exception) {
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("Error during task creation")
        }
    }

    // Falta handlear casos de error
    @GetMapping("/{title}")
    fun find(@PathVariable title: String): TaskDTO {
        val task = taskService.find(title)
        return TaskDTO.fromModel(task)
    }
}