package org.codebhatti.sathivai.repository

import org.codebhatti.sathivai.domain.Post
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

/**
 * Created by binayrai on 9/3/17.
 */
@Repository
interface PostRepository extends CrudRepository<Post,Long> {

    Post findFirstByOrderByPostedOnDesc();

    List<Post> findAllByOrderByPostedOnDesc();

    Post findBySlug(String slug);

}