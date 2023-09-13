package com.example.jetpackcomposetodoapp.addtasks.domain

import com.example.jetpackcomposetodoapp.addtasks.data.TaskRepository
import com.example.jetpackcomposetodoapp.ui.model.TaskModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTasksUseCase @Inject constructor(private val taskRepository: TaskRepository) {
    operator fun invoke(): Flow<List<TaskModel>> {
        return taskRepository.tasks
    }
}