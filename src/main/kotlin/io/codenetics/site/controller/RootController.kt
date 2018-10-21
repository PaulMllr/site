package io.codenetics.site.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import javax.servlet.http.HttpServletRequest

@Controller
@RequestMapping("/")
class RootController {

    @RequestMapping
    fun getRoot(request: HttpServletRequest, model: Model): String {
        model.addAttribute("message","Coming soon")
        return "homepage"
    }

}