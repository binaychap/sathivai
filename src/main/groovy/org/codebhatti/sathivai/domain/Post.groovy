package org.codebhatti.sathivai.domain

import org.springframework.data.annotation.CreatedDate

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.Temporal
import javax.persistence.TemporalType


@Entity
class Post {

    @Id @GeneratedValue
    Long id
    String title

    @Column(columnDefinition = "TEXT")
    String body

    @Column(columnDefinition = "TEXT")
    String teaser

    String slug

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    Date postedOn

    @ManyToOne
    Author author

    Post() {}


}
