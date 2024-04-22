plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    alias(libs.plugins.kapt)
}

android {
    namespace = "com.allaber.belltime"
    compileSdk = AppConfig.compileSdkVersion

    defaultConfig {
        applicationId = "com.allaber.belltime"
        minSdk = AppConfig.minSdkVersion
        targetSdk = AppConfig.targetSdkVersion
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile(ProGuard.proguardAndroidOptimize),
                ProGuard.proguardRules
            )
        }
    }
    compileOptions {
        sourceCompatibility = AppConfig.sourceCompatibility
        targetCompatibility = AppConfig.targetCompatibility
    }
    kotlinOptions {
        jvmTarget = AppConfig.jvmTarget
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)

    // UI
    implementation(projects.ui.assets)
    implementation(projects.ui.localization)
    implementation(projects.ui.system)

    // Core
    implementation(projects.core.data)
    implementation(projects.core.domain)

    // Utils
    implementation(projects.utils.utilsUi)

    // DI
    implementation(libs.dagger)
    kapt(libs.daggerCompiler)
}
