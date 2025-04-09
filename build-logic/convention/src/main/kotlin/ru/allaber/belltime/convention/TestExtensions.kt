package ru.allaber.belltime.convention

import org.gradle.api.Project
import org.gradle.kotlin.dsl.DependencyHandlerScope

internal fun DependencyHandlerScope.implementationTest(
    project: Project
) {
    with(project) {
        implementation(
            configurationName = "testImplementation",
            dependency = libs.findLibrary("junit").get()
        )
        implementation(
            configurationName = "androidTestImplementation",
            dependency = libs.findLibrary("androidx-junit").get()
        )
        implementation(
            configurationName = "androidTestImplementation",
            dependency = libs.findLibrary("androidx-espresso-core").get()
        )
        implementation(
            configurationName = "androidTestImplementation",
            dependency = platform(libs.findLibrary("androidx-compose-bom").get())
        )
        implementation(
            configurationName = "androidTestImplementation",
            dependency = libs.findLibrary("androidx-ui-test-junit4").get()
        )
    }
}