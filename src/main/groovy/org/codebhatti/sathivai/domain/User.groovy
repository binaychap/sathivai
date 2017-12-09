package org.codebhatti.sathivai.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document

/**
 * Created by binai_rai on 12/9/17.
 */
@Document
class User {

    @Id
    BigInteger id
    String email
    String password
    String fullName
    Set<String> roles

    User() {}

    @Override
    public String toString() {
        return "User [id=" + id + ", email=" + email + ", password=" + password + "]";
    }
}
