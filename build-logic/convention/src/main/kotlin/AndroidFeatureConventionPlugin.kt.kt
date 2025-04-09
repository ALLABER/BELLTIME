import com.android.build.api.dsl.ApplicationExtension
import com.android.build.gradle.LibraryExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType
import ru.allaber.belltime.convention.configureAndroidCompose
import ru.allaber.belltime.convention.configureAndroidProject
import ru.allaber.belltime.convention.configureBuildTypes
import ru.allaber.belltime.convention.configureKotlin
import ru.allaber.belltime.convention.implementationCompose
import ru.allaber.belltime.convention.implementationCoreKtx
import ru.allaber.belltime.convention.implementationDebug
import ru.allaber.belltime.convention.implementationLifecycle

class AndroidFeatureConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            apply(plugin = "com.android.library")
            apply(plugin = "org.jetbrains.kotlin.android")
            apply(plugin = "org.jetbrains.kotlin.plugin.compose")

            extensions.getByType<LibraryExtension>().apply {
                configureKotlin()
                configureAndroidProject(this)
                configureBuildTypes(this)
                configureAndroidCompose(this)
            }

            dependencies {
                implementationCoreKtx(project = target)
                implementationLifecycle(project = target)
                implementationCompose(project = target)
                implementationDebug(project = target)
            }
        }
    }
}