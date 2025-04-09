package ru.allaber.belltime.convention

import org.gradle.api.Project
import org.gradle.kotlin.dsl.DependencyHandlerScope

internal fun DependencyHandlerScope.implementationDebug(
    project: Project
) {
    with(project) {
        implementation(
            configurationName = "debugImplementation",
            dependency = libs.findLibrary("androidx-ui-tooling").get()
        )
        implementation(
            configurationName = "debugImplementation",
            dependency = libs.findLibrary("androidx-ui-test-manifest").get()
        )
    }
}