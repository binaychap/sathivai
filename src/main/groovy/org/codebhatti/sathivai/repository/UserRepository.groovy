package org.codebhatti.sathivai.repository

import org.codebhatti.sathivai.domain.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

/**
 * Created by binai_rai on 12/9/17.
 */
@Repository
interface UserRepository extends CrudRepository<User, BigInteger> {

    User findByEmail(String email)
}
