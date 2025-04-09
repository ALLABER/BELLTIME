plugins {
    alias(libs.plugins.app.android.application.plugin)
}

android {
    namespace = "ru.allaber.belltime"
}

dependencies {
    implementation(projects.ui.localization)
    implementation(projects.feature.home.homeApi)
    implementation(projects.feature.home.homeImpl)
    implementation(projects.feature.settings.settingsApi)
    implementation(projects.feature.settings.settingsImpl)
}