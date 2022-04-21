package com.github.kekexi55.pluginleetcode.services

import com.intellij.openapi.project.Project
import com.github.kekexi55.pluginleetcode.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
