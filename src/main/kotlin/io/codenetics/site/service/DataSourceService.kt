package io.codenetics.site.service

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.stereotype.Service

/**
 *  Created by Pavel Laktiushkin on 04.10.2018
 */

const val HOMEPAGE_RESOURCE_JSON_NAME = "/homepage.json"
const val PROJECTS_RESOURCE_JSON_NAME = "/projects.json"

@Service
class DataSourceService {

    fun formHomePageData(): Map<String, *> {
        return formModelFromJson(HOMEPAGE_RESOURCE_JSON_NAME)
    }

    fun formProjectsPageData(): Map<String, *> {
        return formModelFromJson(PROJECTS_RESOURCE_JSON_NAME)
    }

    private fun formModelFromJson(jsonPath: String): Map<String, *> {
        val result = ObjectMapper().readValue(javaClass.getResourceAsStream(jsonPath), HashMap::class.java)
        @Suppress("UNCHECKED_CAST")
        return result as Map<String, *>
    }
}