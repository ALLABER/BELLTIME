pluginManagement {
    includeBuild("build-logic")
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "BELLTIME"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
include(":app")
include(":ui:localization")
include(":feature:home:home-api")
include(":feature:settings:settings-api")
include(":feature:home:home-impl")
include(":feature:settings:settings-impl")
