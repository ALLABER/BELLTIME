package ru.allaber.belltime.convention

import org.gradle.api.Project
import org.gradle.kotlin.dsl.DependencyHandlerScope

internal fun DependencyHandlerScope.implementationNavigation(
    project: Project
) {
    with(project) {
        implementation(dependency = libs.findLibrary("androidx-navigation-compose").get())
    }
}