package org.codebhatti.sathivai.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document


@Document
class Post {

    @Id
    BigInteger id
    String title
    String body
    String teaser
    String slug
    Date postedOn

    @DBRef
    Author author
    Post(){}

    @Override
    String toString() {
        return "Post [title=" + title + "]"
    }

}
