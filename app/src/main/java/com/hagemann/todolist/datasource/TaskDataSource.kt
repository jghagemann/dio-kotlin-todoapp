package com.hagemann.todolist.datasource

import com.hagemann.todolist.model.Task

object TaskDataSource {
    private val list = arrayListOf<Task>()

    fun getList() = list.toList()

    fun inserTask(task: Task) {
        if (task.id == 0 ) {
            list.add(task.copy(id = list.size + 1))
        } else {
            list.remove(task)
            list.add(task)
        }
        list.add(task.copy(id = list.size + 1))
    }

    fun findById(taskId: Int) = list.find { it.id == taskId }

    fun deleteTask(task: Task) {
        list.remove(task)
    }

}