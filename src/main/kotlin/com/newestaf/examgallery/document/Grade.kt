package com.newestaf.examgallery.document

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Grade(
    @Id
    var id: String? = null,
    var grade: Int,
    @DBRef
    var subject: List<Grade>
)
