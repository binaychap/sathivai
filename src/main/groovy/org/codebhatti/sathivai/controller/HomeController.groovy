package org.codebhatti.sathivai.controller

import org.codebhatti.sathivai.service.PostService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping


@Controller
class HomeController {

    @Autowired
    PostService postService

    @RequestMapping("/")
    String home(Model model){
        def post =  postService.getLatestPost()
        model.addAttribute("post",post)
        return "index"
    }
}
