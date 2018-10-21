package io.codenetics.site

import io.codenetics.site.config.MvcWebConfig
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import


@SpringBootApplication(scanBasePackages = ["io.codenetics.site"])
class SiteApplication


fun main(args: Array<String>) {
    runApplication<SiteApplication>(*args)


}
