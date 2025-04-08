import com.android.build.api.dsl.ApplicationExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.getByType
import ru.allaber.belltime.convention.configureAndroidCompose
import ru.allaber.belltime.convention.configureAndroidConfig
import ru.allaber.belltime.convention.configureAndroidProject
import ru.allaber.belltime.convention.configureBuildTypes
import ru.allaber.belltime.convention.configureKotlin

class AndroidApplicationConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            apply(plugin = "com.android.application")
            apply(plugin = "org.jetbrains.kotlin.android")
            apply(plugin = "org.jetbrains.kotlin.plugin.compose")

            extensions.getByType<ApplicationExtension>().apply {
                configureKotlin()
                configureAndroidConfig(this)
                configureAndroidProject(this)
                configureBuildTypes(this)
                configureAndroidCompose(this)
            }
        }
    }
}