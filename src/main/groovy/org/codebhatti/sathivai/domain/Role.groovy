package org.codebhatti.sathivai.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 * Created by binai_rai on 12/9/17.
 */

@Document
class Role {

    @Id
    BigInteger id
    String role
    Role(){}



    @Override
    String toString() {
        return "Role [id=" + id + ", role=" + role + "]"
    }
}
