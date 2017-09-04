package org.codebhatti.sathivai.controller


import org.codebhatti.sathivai.service.PostService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping('/posts')
class PostController {

    @Autowired
    PostService postService


    @RequestMapping("/list")
    String listPosts(Model model){
        model.addAttribute("posts", postService.list())
        return "post/list"
    }

    @RequestMapping("/view/{slug}")
    String view(@PathVariable(value="slug") String slug, Model model){
        model.addAttribute("post", postService.getBySlug(slug))
        return "post/view"
    }
}
