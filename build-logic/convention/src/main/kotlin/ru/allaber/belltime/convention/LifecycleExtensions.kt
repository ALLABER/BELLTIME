package ru.allaber.belltime.convention

import org.gradle.api.Project
import org.gradle.kotlin.dsl.DependencyHandlerScope

internal fun DependencyHandlerScope.implementationLifecycle(
    project: Project
) {
    with(project) {
        implementation(dependency = libs.findLibrary("androidx-lifecycle-runtime-ktx").get())
    }
}