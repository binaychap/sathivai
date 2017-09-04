package org.codebhatti.sathivai.repository

import org.codebhatti.sathivai.domain.Author
import org.springframework.data.repository.CrudRepository

/**
 * Created by binayrai on 9/3/17.
 */
interface AuthorRepository extends CrudRepository<Author,Long>{

}