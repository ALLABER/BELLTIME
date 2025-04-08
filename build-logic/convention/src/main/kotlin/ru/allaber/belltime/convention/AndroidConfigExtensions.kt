package ru.allaber.belltime.convention

import com.android.build.api.dsl.ApplicationExtension
import org.gradle.api.Project

internal fun Project.configureAndroidConfig(
    applicationExtension: ApplicationExtension,
) {
    applicationExtension.apply {
        defaultConfig.applicationId = libs.findVersion("applicationId").get().toString()
        defaultConfig.targetSdk = libs.findVersion("targetSdk").get().toString().toInt()
        defaultConfig.versionCode = libs.findVersion("versionCode").get().toString().toInt()
        defaultConfig.versionName = libs.findVersion("versionName").get().toString()
    }
}