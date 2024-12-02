package com.example.loginhappytraveller.ui.presentation.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.loginhappytraveller.R
import com.example.loginhappytraveller.Screens


@Composable
fun HomeScreen(navController: NavHostController, viewModel: HomeViewModel= hiltViewModel()) {
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            // Banner de fondo
            Image(
                painter = painterResource(id = R.drawable.headerbanner),
                contentDescription = "header banner happytraveller",
                modifier = Modifier.fillMaxWidth()
            )

            // Logo dentro del banner, alineado a la izquierda
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Login image happytraveller",
                modifier = Modifier
                    .size(72.dp)
                    .align(Alignment.CenterStart)
            )

            Image(
                painter = painterResource(id = R.drawable.iconouser1),
                contentDescription = "User icon happytraveller",
                modifier = Modifier
                    .size(55.dp)
                    .align(Alignment.CenterEnd)
                    .offset(x = (-46).dp)
            )
        }


          //// ---------- correo de logeo y boton de deslogeo --------------

        Box(
            modifier = Modifier.fillMaxWidth()
        ) {

            Column(
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.End

            ) {
                Text(
                    text = viewModel.email!!
                )

                TextButton(
                    border = BorderStroke(1.dp, Color.Red),
                    shape = RoundedCornerShape(5.dp),
                    onClick = {
                        viewModel.logout()
                        navController.navigate(Screens.Login.route) {
                            popUpTo(Screens.Home.route) { inclusive = true }
                        }
                    },
                    modifier = Modifier.offset(x = (-27).dp)
                ) {
                    Text(text = "Cerrar Sesion")
                }
            }
        }
             ////// ---------------fin  mail y boton logout----------------------------
        Spacer(modifier = Modifier.height(45.dp))

        Image(painter = painterResource(id = R.drawable.body1), contentDescription = "Login image happytraveller",
            modifier = Modifier.size(300.dp))



      Image(painter = painterResource(id = R.drawable.body2), contentDescription = "Login image happytraveller",
           modifier = Modifier.size(350.dp)
               .offset(y = (-62).dp))

        Image(painter = painterResource(id = R.drawable.body3), contentDescription = "Login image happytraveller",
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(1f)
            .offset(y = (-30).dp)
        )

    }
}