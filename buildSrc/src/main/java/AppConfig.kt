import org.gradle.api.JavaVersion

object AppConfig {
    const val compileSdkVersion = 34
    const val buildToolsVersion = "34.0.0"
    const val minSdkVersion = 24
    const val targetSdkVersion = 34

    val sourceCompatibility = JavaVersion.VERSION_17
    val targetCompatibility = JavaVersion.VERSION_17
    const val jvmTarget = "17"

    const val versionCode = 1
    const val versionName = "1.0.0"
}
