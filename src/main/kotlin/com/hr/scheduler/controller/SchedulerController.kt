package com.hr.scheduler.controller

import com.hr.scheduler.entity.Data
import com.hr.scheduler.repository.DataRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SchedulerController(private val dataRepository: DataRepository) {
    @GetMapping("/select")
    fun getData(): List<Data> = dataRepository.findAll()
}