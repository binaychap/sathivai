package org.codebhatti.sathivai

import org.codebhatti.sathivai.domain.Author
import org.codebhatti.sathivai.domain.Post
import org.codebhatti.sathivai.domain.User
import org.codebhatti.sathivai.repository.AuthorRepository
import org.codebhatti.sathivai.repository.PostRepository
import org.codebhatti.sathivai.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import javax.annotation.PostConstruct

/**
 * Created by binai_rai on 11/25/17.
 */
@Service
class DatabaseLoader {

    @Autowired
    PostRepository postRepository
    @Autowired
    AuthorRepository authorRepository

    @Autowired
    UserRepository userRepository

    @PostConstruct
    private void initDatabase(){

        authorRepository.deleteAll()
        Author dv = new Author()
        dv.setFirstName("Dan")
        dv.setLastName("Vega")
        dv.setEmail("danvega@gmail.com")
        authorRepository.save(dv)

        postRepository.deleteAll()

        Post post = new Post()
        post.setTitle("Spring Data Rocks!")
        post.setSlug("spring-data-rocks")
        post.setTeaser("Post Teaser")
        post.setBody("Post Body")
        post.setPostedOn(new Date())
        post.setAuthor(dv)
        postRepository.save(post)

        dv.getPosts().add(post)
        authorRepository.save(dv)

        userRepository.deleteAll()


        def user = new User(id: 12, email: "binaychap@gmail.com",password: "1234",fullName: "Binay rai",roles: ["ROLE_ADMIN","ROLE_USER"] as Set )

        userRepository.save(user)


    }

}
