
package io.codenetics.site.service

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.stereotype.Service

/**
 *  Created by Pavel Laktiushkin on 04.10.2018
 */

const val HOMEPAGE_RESOURCE_JSON_NAME = "/homepage.json"

@Service
class DataSourceService {

    fun formHomePageData(): Map<String, *> {
        val result = ObjectMapper().readValue(javaClass.getResourceAsStream(HOMEPAGE_RESOURCE_JSON_NAME), HashMap::class.java)
        @Suppress("UNCHECKED_CAST")
        return result as Map<String, *>
    }
}