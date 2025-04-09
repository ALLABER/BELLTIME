plugins {
    alias(libs.plugins.app.android.application.plugin)
}

android {
    namespace = "ru.allaber.belltime"
}

dependencies {
    implementation(projects.ui.localization)
}