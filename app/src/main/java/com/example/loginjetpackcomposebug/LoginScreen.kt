package com.example.loginjetpackcomposebug

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen()
{
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
         horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.drawable.mobilelogin),
            contentDescription = "Login image",
            modifier = Modifier.size(200.dp))
        Text(text="Welcome Back", fontSize = 28.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(4.dp))
        Text(text="Login is your  account")
        OutlinedTextField(value = email, onValueChange = {
            email=it
        }, label = {
            Text(text="Email")
        })
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = password, onValueChange = {
            password=it
        }, label = {
            Text(text="Password")
        }, visualTransformation = PasswordVisualTransformation())
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            Log.i("Crendential","email:$email Password:$password")
        }) {
            Text(text="login")
        }
        Spacer(modifier = Modifier.height(52.dp))

        Text(text="Forgot password", modifier = Modifier.clickable {

        })
        Spacer(modifier = Modifier.height(52.dp))

        Text(text="Or sign in with")

        Row(
            modifier=Modifier.fillMaxWidth().padding(48.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        )
        {
            Image(painter = painterResource(id=R.drawable.google_720255),
                contentDescription = "google",
                modifier = Modifier.size(60.dp).clickable {

                })
            Image(painter = painterResource(R.drawable.facebook_5968764),
                contentDescription = "facebook",
                modifier = Modifier.size(60.dp).clickable {

                })
            Image(painter = painterResource(R.drawable.twitter_5969020),
                contentDescription = "twitter",
                modifier = Modifier.size(60.dp).clickable {

                })
        }

    }
}
