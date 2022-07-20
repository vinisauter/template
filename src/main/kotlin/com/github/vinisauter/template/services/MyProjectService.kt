package com.github.vinisauter.template.services

import com.intellij.openapi.project.Project
import com.github.vinisauter.template.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
