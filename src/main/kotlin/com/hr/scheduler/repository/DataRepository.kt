package com.hr.scheduler.repository

import com.hr.scheduler.entity.Data
import org.springframework.data.jpa.repository.JpaRepository

interface DataRepository : JpaRepository<Data, Long>
