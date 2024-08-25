package org.example.kmp


import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.ui.tooling.preview.Preview

//light colors scheme

val lightColorScheme = lightColorScheme(
    primary = lightPrimary,
    onPrimary = onLightPrimary ,
    secondary = lightSecondary,
    onSecondary = onLightSecondary ,
    tertiary = lightTertiary,
    onTertiary = onLightTertiary,
    primaryContainer = primaryLightContainer,
    onPrimaryContainer = onLightPrimaryContainer,
    secondaryContainer = secondaryLightContainer,
    onSecondaryContainer = onSecondaryLightContainer,
    tertiaryContainer = tertiaryLightContainer,
    onTertiaryContainer = onTertiaryLightContainer,
    errorContainer = errorLightContainer,
    onErrorContainer = onErrorLightContainer,
    surfaceDim = surfaceDimLight,
    surface = surfaceLight,
    surfaceBright = surfaceBright,
    background = backgroundLight,
    surfaceContainer = surfCont,
    surfaceContainerLow = surfContLow,
    surfaceContainerLowest = surfContLowest,
    surfaceContainerHigh = surfContHigh,
    surfaceContainerHighest = surfContHighest,
    onSurface = onSurface,
    onSurfaceVariant = onSurfVar,
    outline = outline,
    outlineVariant = outlineVar,
    inversePrimary = inversePrimary,
    inverseSurface = inverseSurface,
    inverseOnSurface = inverseOnSurface,
    error = error,
    onError = onError
)
//Dark Colors Scheme
val darkColorScheme = lightColorScheme(
    primary = darkPrimary,
    onPrimary = onDarkPrimary ,
    secondary = darkSecondary,
    onSecondary = onDarkSecondary ,
    tertiary = darkTertiary,
    onTertiary = onDarkTertiary,
    primaryContainer = primaryDarkContainer,
    onPrimaryContainer = onDarkPrimaryContainer,
    secondaryContainer = secondaryDarkContainer,
    onSecondaryContainer = onSecondaryDarkContainer,
    tertiaryContainer = tertiaryDarkContainer,
    onTertiaryContainer = onTertiaryDarkContainer,
    errorContainer = errorDarkContainer,
    onErrorContainer = onErrorDarkContainer,
    surfaceDim = surfaceDimDark,
    surface = surfaceDark,
    surfaceBright = surfaceBrightDark,
    background = backgroundDark,
    surfaceContainer = surfContDark,
    surfaceContainerLow = surfContLowDark,
    surfaceContainerLowest = surfContLowestDark,
    surfaceContainerHigh = surfContHighDark,
    surfaceContainerHighest = surfContHighestDark,
    onSurface = onSurfaceDark,
    onSurfaceVariant = onSurfVarDark,
    outline = outlineDark,
    outlineVariant = outlineVarDark,
    inversePrimary = inversePrimaryDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    error = errorDark,
    onError = onErrorDark,

)

@Composable
@Preview
fun App() {
    //Check if system is in dark mode or light mode
    val colors by mutableStateOf(
        if(isSystemInDarkTheme()) darkColorScheme else lightColorScheme
    )
    MaterialTheme (colorScheme = colors){

    }
}