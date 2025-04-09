package ru.allaber.belltime.main.presentation.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ru.allaber.belltime.main.presentation.component.BottomNavigationBar
import ru.allaber.belltime.main.presentation.model.NavRoutes
import ru.allaber.belltime.ui.theme.AppTheme
import ru.allaber.homeimpl.presentation.ui.HomeScreen
import ru.allaber.settingsimpl.presentation.ui.SettingsScreen

@Composable
internal fun MainScreen() {
    val navController = rememberNavController()

    MainContent(
        navController = navController
    )
}

@Composable
private fun MainContent(
    navController: NavHostController
) {
    Surface {
        Column {
            NavHost(
                navController = navController,
                startDestination = NavRoutes.Home.route,
                modifier = Modifier.weight(1f)
            ) {
                composable(NavRoutes.Home.route) { HomeScreen() }
                composable(NavRoutes.Settings.route) { SettingsScreen() }
            }

            BottomNavigationBar(
                navController = navController
            )
        }
    }
}


@Preview
@Composable
fun MainContentPreview() {
    AppTheme {
        MainContent(
            navController = rememberNavController()
        )
    }
}