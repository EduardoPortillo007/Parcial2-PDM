package com.pdmcourse2026.basictemplate

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.pdmcourse2026.basictemplate.screens.home.HomeScreen
import com.pdmcourse2026.basictemplate.screens.home.PantallaResultados
import com.pdmcourse2026.basictemplate.viewmodel.ViewModelCoso

@Composable
fun RankeUCA_App() {
  val backStack = rememberNavBackStack(Routes.Home)

  val viewModel : ViewModelCoso = viewModel()
  NavDisplay(
    backStack = backStack,
    onBack = { backStack.removeLastOrNull() },
    entryProvider = entryProvider {
      entry<Routes.Home> {
        HomeScreen(
          backStack =backStack,
          viewModel = viewModel
        )
      }
      entry<Routes.Resultados> {
        PantallaResultados(
          backStack = backStack
        )
      }
    },
  )


}