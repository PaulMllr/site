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
        model.addAttribute("interests", listOf(
                "JVM",
                "High-availability",
                "High-loaded applications",
                "Performance profiling & optimisation",
                "Distributed applications",
                "Web-services",
                "RESTful services",
                "Micro-services",
                "SQL",
                "NoSQL",
                "Artificial Intelligence",
                "Artificial neural networks",
                "Machine learning"))
        model.addAttribute("techs", listOf(
                "Java 8",
                "Kotlin",
                "VisualVM"
                ))
        return "homepage"
    }

}