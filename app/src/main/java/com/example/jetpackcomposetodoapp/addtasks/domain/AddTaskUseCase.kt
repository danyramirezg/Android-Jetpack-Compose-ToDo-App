package com.example.jetpackcomposetodoapp.addtasks.domain

import com.example.jetpackcomposetodoapp.addtasks.data.TaskRepository
import com.example.jetpackcomposetodoapp.ui.model.TaskModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AddTaskUseCase @Inject constructor(private val taskRepository: TaskRepository) {
    suspend operator fun invoke(): Flow<List<TaskModel>> {
        return taskRepository.tasks
    }

}