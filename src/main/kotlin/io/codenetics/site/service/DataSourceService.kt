/*
 * Copyright Rhonda Software Ltd. 2018.
 * All rights reserved.
 */

package io.codenetics.site.service

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.stereotype.Service

const val HOMEPAGE_RESOURCE_JSON_NAME = "/homepage.json"

@Service
class DataSourceService {

    fun formHomePageData(): Map<String, *> {
        val result = ObjectMapper().readValue(javaClass.getResourceAsStream(HOMEPAGE_RESOURCE_JSON_NAME), HashMap::class.java)
        @Suppress("UNCHECKED_CAST")
        return result as Map<String, *>
    }
}