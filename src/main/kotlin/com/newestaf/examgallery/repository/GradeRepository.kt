package com.newestaf.examgallery.repository

import com.newestaf.examgallery.document.Grade
import org.springframework.data.mongodb.repository.MongoRepository

interface GradeRepository : MongoRepository<Grade, String> {

    fun findByGrade(grade: Int): List<Grade>

}
