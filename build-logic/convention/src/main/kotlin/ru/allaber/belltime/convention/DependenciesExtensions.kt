package ru.allaber.belltime.convention

import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.DependencyHandlerScope

internal fun DependencyHandlerScope.implementation(
    configurationName: String = "implementation",
    dependency: Provider<MinimalExternalModuleDependency>,
) {
    add(configurationName, dependency)
}