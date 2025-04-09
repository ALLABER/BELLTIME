package ru.allaber.belltime.main.presentation.model

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import ru.allaber.localization.R.string as LocalRes

internal sealed class NavBarItems(
    @StringRes
    val titleResId: Int,
    val route: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector
) {
    data object HomeItem : NavBarItems(
        titleResId = LocalRes.home,
        route = NavRoutes.Home.route,
        selectedIcon = Icons.Filled.Home,
        unselectedIcon = Icons.Outlined.Home
    )

    data object SettingsItem : NavBarItems(
        titleResId = LocalRes.settings,
        route = NavRoutes.Settings.route,
        selectedIcon = Icons.Filled.Settings,
        unselectedIcon = Icons.Outlined.Settings
    )
}

internal val BOTTOM_NAV_DESTINATIONS = mutableListOf(
    NavBarItems.HomeItem,
    NavBarItems.SettingsItem
)