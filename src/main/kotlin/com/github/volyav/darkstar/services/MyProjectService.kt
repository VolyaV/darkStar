package com.github.volyav.darkstar.services

import com.intellij.openapi.project.Project
import com.github.volyav.darkstar.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
