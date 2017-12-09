package org.codebhatti.sathivai.service

import org.codebhatti.sathivai.domain.User

/**
 * Created by binai_rai on 12/9/17.
 */
interface UserService {
   User findByEmail(String email)

}
