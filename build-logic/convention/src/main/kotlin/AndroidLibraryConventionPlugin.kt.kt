import com.android.build.gradle.LibraryExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.getByType
import ru.allaber.belltime.convention.configureAndroidProject
import ru.allaber.belltime.convention.configureBuildTypes

class AndroidLibraryConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            apply(plugin = "com.android.library")

            extensions.getByType<LibraryExtension>().apply {
                configureAndroidProject(this)
                configureBuildTypes(this)
            }
        }
    }
}