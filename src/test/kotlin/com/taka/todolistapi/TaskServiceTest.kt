package com.taka.todolistapi

import com.taka.todolistapi.service.TaskService
import org.bson.assertions.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class TaskServiceTest {
	@Autowired private lateinit var service: TaskService

	@BeforeEach
	fun setUp() {

	}
//	@Test
//	fun contextLoads() {
//	}

	@Test
	fun findTaskIsNotNull(){
		val task = service.find("clean")
		Assertions.assertNotNull(task.title)
	}
}
