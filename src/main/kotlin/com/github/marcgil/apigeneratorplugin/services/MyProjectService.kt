package com.github.marcgil.apigeneratorplugin.services

import com.github.marcgil.apigeneratorplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
