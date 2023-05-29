package com.example.jarell

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jarell.ui.theme.JarellTheme

class LiquorActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mydrink()

        }
    }
}

@Composable
fun mydrink(){
    var scrollState= rememberScrollState()
    Column(modifier = Modifier.fillMaxSize().verticalScroll(scrollState), horizontalAlignment = Alignment.Start, verticalArrangement = Arrangement.SpaceAround) {
        Card(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = Modifier
                .background(color = Color.LightGray)
                .fillMaxWidth()) {
                Image(painter = painterResource(id = R.drawable.henny) , contentDescription = "", modifier = Modifier
                    .padding(10.dp)
                    .background(color = Color.Gray))
              Column() {
                  Text(text ="Hennesy", fontSize = 20.sp, modifier = Modifier.padding(5.dp), fontStyle = FontStyle.Italic, fontWeight = FontWeight.Bold)
                  Text(text =" at", fontSize = 20.sp, modifier = Modifier.padding(1.dp), fontWeight = FontWeight.Medium)
                  Text(text ="Ksh"+1000, fontSize = 20.sp, modifier = Modifier.padding(1.dp), fontWeight = FontWeight.Light)
              }
            }

        }

        Card(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = Modifier
                .background(color = Color.LightGray)
                .fillMaxWidth()) {
                Image(painter = painterResource(id = R.drawable.imperial) , contentDescription = "", modifier = Modifier
                    .padding(10.dp)
                    .background(color = Color.Gray))
                Column() {
                    Text(text ="Imperial", fontSize = 20.sp, modifier = Modifier.padding(5.dp), fontStyle = FontStyle.Italic, fontWeight = FontWeight.Bold)
                    Text(text =" at", fontSize = 20.sp, modifier = Modifier.padding(1.dp), fontWeight = FontWeight.Medium)
                    Text(text ="Ksh"+1050, fontSize = 20.sp, modifier = Modifier.padding(1.dp), fontWeight = FontWeight.Light)
                }
            }

        }

        Card(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = Modifier
                .background(color = Color.LightGray)
                .fillMaxWidth()) {
                Image(painter = painterResource(id = R.drawable.jagermeister) , contentDescription = "", modifier = Modifier
                    .padding(10.dp)
                    .background(color = Color.Gray))
                Column() {
                    Text(text ="Jagermeister ", fontSize = 20.sp, modifier = Modifier.padding(5.dp), fontStyle = FontStyle.Italic, fontWeight = FontWeight.Bold)
                    Text(text =" at", fontSize = 20.sp, modifier = Modifier.padding(1.dp), fontWeight = FontWeight.Medium)
                    Text(text ="Ksh"+1500, fontSize = 20.sp, modifier = Modifier.padding(1.dp), fontWeight = FontWeight.Light)
                }
            }

        }

        Card(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = Modifier
                .background(color = Color.LightGray)
                .fillMaxWidth()) {
                Image(painter = painterResource(id = R.drawable.jack) , contentDescription = "", modifier = Modifier
                    .padding(10.dp)
                    .background(color = Color.Gray))
                Column() {
                    Text(text ="Jack Daniels", fontSize = 20.sp, modifier = Modifier.padding(5.dp), fontStyle = FontStyle.Italic, fontWeight = FontWeight.Bold)
                    Text(text =" at", fontSize = 20.sp, modifier = Modifier.padding(1.dp), fontWeight = FontWeight.Medium)
                    Text(text ="Ksh"+1850, fontSize = 20.sp, modifier = Modifier.padding(1.dp), fontWeight = FontWeight.Light)
                }
            }

        }

        Card(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = Modifier
                .background(color = Color.LightGray)
                .fillMaxWidth()) {
                Image(painter = painterResource(id = R.drawable.vedrenne) , contentDescription = "", modifier = Modifier
                    .padding(10.dp)
                    .background(color = Color.Gray))
                Column() {
                    Text(text ="Vedrenne", fontSize = 20.sp, modifier = Modifier.padding(5.dp), fontStyle = FontStyle.Italic, fontWeight = FontWeight.Bold)
                    Text(text =" at", fontSize = 20.sp, modifier = Modifier.padding(1.dp), fontWeight = FontWeight.Medium)
                    Text(text ="Ksh"+2000, fontSize = 20.sp, modifier = Modifier.padding(1.dp), fontWeight = FontWeight.Light)
                }
            }

        }

    }
}

@Preview(showBackground = true)
@Composable
fun mydrinkPreview(){
    mydrink()

}


