package ru.allaber.belltime.convention

import org.gradle.api.Project
import org.gradle.kotlin.dsl.DependencyHandlerScope

internal fun DependencyHandlerScope.implementationDagger(
    project: Project
) {
    with(project) {
        implementation(dependency = libs.findLibrary("di-dagger").get())
        implementation(
            configurationName = "kapt",
            dependency = libs.findLibrary("di-dagger-compiler").get()
        )
    }
}