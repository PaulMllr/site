package io.codenetics.site

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 *  Created by Pavel Laktiushkin on 04.10.2018
 */

@SpringBootApplication(scanBasePackages = ["io.codenetics.site"])
class SiteApplication


fun main(args: Array<String>) {
    runApplication<SiteApplication>(*args)
}
