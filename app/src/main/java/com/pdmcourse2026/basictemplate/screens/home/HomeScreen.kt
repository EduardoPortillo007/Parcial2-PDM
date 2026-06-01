package com.pdmcourse2026.basictemplate.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import coil3.compose.AsyncImage
import com.pdmcourse2026.basictemplate.Routes
import com.pdmcourse2026.basictemplate.data.modelo.Option
import com.pdmcourse2026.basictemplate.viewmodel.ViewModelCoso
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalContext
import coil3.request.ImageRequest
import coil3.request.crossfade

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
  backStack: NavBackStack<NavKey>,
  viewModelCoso: ViewModelCoso
) {
  val Option by viewModelCoso.option.collectAsState()
  Scaffold(
    topBar = {
      TopAppBar(
        colors = topAppBarColors(
          containerColor = MaterialTheme.colorScheme.primaryContainer,
          titleContentColor = MaterialTheme.colorScheme.primary,
        ),
        title = { Text("RankeUca - Vota") },
      )
    }
  ) { innerPadding ->
    Column(modifier = Modifier.padding(innerPadding)) {

      LazyColumn(modifier = Modifier.fillMaxSize()){
        itemsIndexed(Option){ indice, Option ->

          OutlinedCard(modifier = Modifier.width(350.dp).height(150.dp).padding(8.dp)) {
            Row(modifier = Modifier.fillMaxSize()) {
              AsyncImage(
                model = ImageRequest.Builder(LocalContext.current).data(Option.imageURL).crossfade(true).build(),
                modifier = Modifier.fillMaxWidth().height(100.dp),
                contentScale = ContentScale.Crop
              )
              Text("Comedor UCA")
            }
            Text("Toca para votar")
          }
        }
      }

      Text(text = "Home Screen")

        OutlinedCard(onClick = {backStack.add(Routes.Resultados)},modifier = Modifier.width(350.dp).height(80.dp).padding(5.dp)) {
          Text(modifier = Modifier.padding(10.dp),
            text = "Ir a Resultados",
            fontSize = 20.sp)
        }

    }

  }
}