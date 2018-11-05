package io.codenetics.site.config

import org.springframework.context.annotation.Configuration
import org.springframework.http.CacheControl
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import java.util.concurrent.TimeUnit

/**
 *  Created by Pavel Laktiushkin on 04.10.2018
 */

@Configuration
@EnableWebMvc
class MvcWebConfig : WebMvcConfigurer {


    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
        registry
                .addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/", "/static/", "file:/static/")
                .setCacheControl(CacheControl.maxAge(365, TimeUnit.DAYS))
    }

}
