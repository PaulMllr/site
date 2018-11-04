package io.codenetics.site.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import javax.servlet.http.HttpServletRequest

/**
 *  Created by Pavel Laktiushkin on 04.10.2018
 */

const val PROJECTS_VIEW_NAME = "projects/projects"

@Controller
@RequestMapping("/projects")
class ProjectsController {

    @GetMapping
    fun getProjects(request: HttpServletRequest, model: Model): String {
        return PROJECTS_VIEW_NAME
    }
}