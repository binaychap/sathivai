package org.codebhatti.sathivai.service


import org.codebhatti.sathivai.domain.Post
import org.codebhatti.sathivai.repository.PostRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by binayrai on 9/3/17.
 */

@Service
class PostService {

    @Autowired
    PostRepository postRepository

    Post getLatestPost(){
        return postRepository.findFirstByOrderByPostedOnDesc();
    }

    List<Post> list() {
        return postRepository.findAllByOrderByPostedOnDesc();
    }

    Post getBySlug(String slug) {
        return postRepository.findBySlug(slug);
    }
}
