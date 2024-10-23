package com.example.mvvm_basic

import android.util.Log
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import java.lang.StrictMath.random

@Composable
fun IU(miViewModel: MyViewModel) {
    // creo un boton
    Boton(miViewModel, Colores.CLASE_AZUL)
}

/**
 * Crea un boton
 */
// estoy usando un enum, tanto para el color como para el texto, el enum lo pondre en el model
@Composable
fun Boton(miViewModel: MyViewModel, enum_color: Colores) {

    // para que sea mas facil la etiqueta del log
    val TAG_LOG: String = "miDebug"

    Button(
        // utilizamos el color del enum
        colors =  ButtonDefaults.buttonColors(enum_color.color),
        onClick = {
            miViewModel.crearRandom()
            //ponemos la _ para diferenciarlo del otro numero
            //genera numero random de 0 a 10
            var _numero = (0..10).random()
            Log.d(TAG_LOG, "Dentro del onClick $_numero")
        },
        modifier = Modifier
            .size((200).dp, (200).dp)
            //.offset(40.dp, 40.dp)
    ) {
        // utilizamos el texto del enum
        Text(text = enum_color.txt, fontSize = 10.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun IUPreview() {
    IU(MyViewModel())
}