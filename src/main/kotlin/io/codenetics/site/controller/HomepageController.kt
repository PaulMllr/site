package io.codenetics.site.controller

import io.codenetics.site.service.DataSourceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import javax.servlet.http.HttpServletRequest

/**
 *  Created by Pavel Laktiushkin on 04.10.2018
 */

const val HOMEPAGE_VIEW_NAME = "homepage"

@Controller
@RequestMapping("/")
class HomepageController {

    @Autowired
    lateinit var dataSourceService: DataSourceService


    @GetMapping
    fun getHomepage(request: HttpServletRequest, model: Model): String {
        model.addAllAttributes(dataSourceService.formHomePageData())
        return HOMEPAGE_VIEW_NAME
    }

}