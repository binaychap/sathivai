package org.codebhatti.sathivai.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document




@Document
class Author {
     @Id
     BigInteger id
     String firstName
     String lastName
     String email

    @DBRef
    List<Post> posts

    Author(){
        posts = new ArrayList<Post>()
    }

    @Override
    String toString() {
        return "Author [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
    }


}
