import com.android.build.api.dsl.ApplicationExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType
import ru.allaber.belltime.convention.configureAndroidCompose
import ru.allaber.belltime.convention.configureAndroidConfig
import ru.allaber.belltime.convention.configureAndroidProject
import ru.allaber.belltime.convention.configureBuildTypes
import ru.allaber.belltime.convention.configureKotlin
import ru.allaber.belltime.convention.implementation
import ru.allaber.belltime.convention.implementationCompose
import ru.allaber.belltime.convention.implementationCoreKtx
import ru.allaber.belltime.convention.implementationDagger
import ru.allaber.belltime.convention.implementationDebug
import ru.allaber.belltime.convention.implementationLifecycle
import ru.allaber.belltime.convention.implementationNavigation
import ru.allaber.belltime.convention.libs

class AndroidApplicationConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            apply(plugin = "com.android.application")
            apply(plugin = "org.jetbrains.kotlin.android")
            apply(plugin = "org.jetbrains.kotlin.plugin.compose")
            apply(plugin = "kotlin-kapt")

            extensions.getByType<ApplicationExtension>().apply {
                configureKotlin()
                configureAndroidConfig(this)
                configureAndroidProject(this)
                configureBuildTypes(this)
                configureAndroidCompose(this)
            }


            dependencies {
                implementation(dependency = libs.findLibrary("androidx-activity-compose").get())
                implementationCoreKtx(project = target)
                implementationLifecycle(project = target)
                implementationCompose(project = target)
                implementationDebug(project = target)
                implementationNavigation(project = target)
                implementationDagger(project = target)
            }
        }
    }


}