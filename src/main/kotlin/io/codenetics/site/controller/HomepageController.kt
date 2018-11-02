package io.codenetics.site.controller

import io.codenetics.site.service.DataSourceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import javax.servlet.http.HttpServletRequest

@Controller
@RequestMapping("/")
class HomepageController {

    @Autowired
    var dataSourceService: DataSourceService = DataSourceService()

    @RequestMapping
    fun getHomepage(request: HttpServletRequest, model: Model): String {
        model.addAllAttributes(dataSourceService.formHomePageData())
        return "homepage"
    }

}