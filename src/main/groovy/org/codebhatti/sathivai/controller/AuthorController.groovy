package org.codebhatti.sathivai.controller


import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by binayrai on 9/3/17.
 */
@Controller
@RequestMapping('/authors')
class AuthorController {


    @RequestMapping("/list")
    String list(){
        return "author/list"
    }

}
