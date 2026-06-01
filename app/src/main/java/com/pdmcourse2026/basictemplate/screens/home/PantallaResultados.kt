package com.pdmcourse2026.basictemplate.screens.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import android.R.attr.onClick
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import coil3.request.ImageRequest

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PantallaResultados(
    backStack: NavBackStack<NavKey>
){
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
            OutlinedCard(modifier = Modifier.width(350.dp).height(150.dp).padding(8.dp)) {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current).data()
                )
                Text("HOLAAA")
            }
            Box(modifier = Modifier.fillMaxSize().padding(12.dp)){
                OutlinedCard(onClick = {backStack.removeLastOrNull()},modifier = Modifier.width(350.dp).height(80.dp).padding(5.dp)) {
                    Text(modifier = Modifier.padding(10.dp),
                        text = "Nuevo (Volver a Votar)",
                        fontSize = 20.sp
                    )
                }
            }
        }

    }

}

