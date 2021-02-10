package com.github.wyvern1019.firsttemplate.services

import com.github.wyvern1019.firsttemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
