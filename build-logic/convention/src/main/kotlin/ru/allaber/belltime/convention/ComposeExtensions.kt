package ru.allaber.belltime.convention

import org.gradle.api.Project
import org.gradle.kotlin.dsl.DependencyHandlerScope


internal fun DependencyHandlerScope.implementationCompose(
    project: Project
) {
    with(project) {
        implementation(dependency = platform(libs.findLibrary("androidx-compose-bom").get()))
        implementation(dependency = libs.findLibrary("androidx-ui").get())
        implementation(dependency = libs.findLibrary("androidx-ui-graphics").get())
        implementation(dependency = libs.findLibrary("androidx-ui-tooling-preview").get())
        implementation(dependency = libs.findLibrary("androidx-material3").get())
    }
}