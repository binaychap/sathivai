package org.codebhatti.sathivai.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToMany


@Entity
class Author {
    @Id
    @GeneratedValue
    Long id;
    String firstName
    String lastName
    String email

    @OneToMany( mappedBy='author')
    List<Post> posts;

    Author() {
    }

    Author(String firstName, String lastName) {
        this.firstName = firstName
        this.lastName = lastName
    }

}
