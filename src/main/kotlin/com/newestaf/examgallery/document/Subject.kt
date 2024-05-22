package com.newestaf.examgallery.document

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Subject(
    @Id
    var id: String? = null,
    var name: String,
    var scope: String
)
