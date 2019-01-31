package io.codenetics.site.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 *  Created by Pavel Laktiushkin on 15.01.2019
 */
@Controller
class SiteMapController {



    @GetMapping("/sitemap.xml")
    @ResponseBody
    fun getSitemap(response: HttpServletResponse): String {
        response.contentType = "application/xml"
        response.characterEncoding = "UTF-8"

        return "<urlset xmlns=\"http://www.sitemaps.org/schemas/sitemap/0.9\">\n" +
                "<url>\n" +
                "<loc>http://codenetics.io</loc>\n" +
                "<lastmod>2019-01-15T12:13:25+00:00</lastmod>\n" +
                "<changefreq>hourly</changefreq>\n" +
                "<priority>1</priority>\n" +
                "</url>\n" +
                "\n" +
                "<url>\n" +
                "<loc>http://codenetics.io/projects</loc>\n" +
                "<lastmod>2019-01-15T12:13:25+00:00</lastmod>\n" +
                "<changefreq>hourly</changefreq>\n" +
                "<priority>0.9</priority>\n" +
                "</url>\n" +
                "</urlset>"
    }
}