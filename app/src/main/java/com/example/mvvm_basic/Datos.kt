package com.example.mvvm_basic

import androidx.compose.ui.graphics.Color

// interesante que sea un singleton poq eu quiero dejar los datos y echarles mano cuando quiera
// poniendole object hacemos que sea un singleton
object Datos {
    var numero = 0

}
//Este es mi enum con los colores utilizados:
/**
 * Colores utilizados
 */
// elementos de colores: color que es de tipo color y ademas un txt que es uns string
enum class Colores(val color: Color, val txt: String) {
    CLASE_ROJO(color = Color.Red, txt = "roxo"),
    CLASE_VERDE(color = Color.Green, txt = "verde"),
    CLASE_AZUL(color = Color.Blue, txt = "azul"),
    CLASE_AMARILLO(color = Color.Yellow, txt = "melo")
}