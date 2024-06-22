package com.hr.scheduler.entity

import jakarta.persistence.*
import java.time.LocalDateTime


@Entity
data class Data(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val insertedTime: LocalDateTime,
    var content: String?
)