/*
 * Copyright Rhonda Software Ltd. 2018.
 * All rights reserved.
 */

package io.codenetics.site.service

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.stereotype.Service
import java.io.File

const val HOMEPAGE_RESOURCE_JSON_NAME = "homepage.json"

@Service
class DataSourceService {

    fun formHomePageData(): Map<String, *> {
        val classLoader = javaClass.classLoader
        val result = ObjectMapper().readValue(File(classLoader.getResource(HOMEPAGE_RESOURCE_JSON_NAME).file), HashMap::class.java)
        @Suppress("UNCHECKED_CAST")
        return result as Map<String, *>
    }
}