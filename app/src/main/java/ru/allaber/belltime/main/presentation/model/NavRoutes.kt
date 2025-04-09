package ru.allaber.belltime.main.presentation.model

internal sealed class NavRoutes(
    val route: String
) {
    data object Home : NavRoutes(route = "home")
    data object Settings : NavRoutes(route = "settings")
}