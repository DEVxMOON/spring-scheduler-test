package com.hr.scheduler.controller

import com.hr.scheduler.entity.Data
import com.hr.scheduler.repository.DataRepository
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@Component
@RestController
class InsertController(private val dataRepository: DataRepository) {

    //3초마다 실행되도록 테스트
    @Scheduled(cron = "*/3 * * * * *", zone = "Asia/Seoul")
    fun scheduledInsert() {
        val data = Data(insertedTime = LocalDateTime.now(), content = "Scheduled Content")
        dataRepository.save(data)
    }
}
