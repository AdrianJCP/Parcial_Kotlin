fun main() {
    print("Ingresa la edad del hombre: ")
    val edad = readLine()!!.toInt()
    print("Ingresa el nivel del Sisben (1, 2, 3 u otro): ")
    val nivelSisben = readLine()!!.toInt()
    val costoBase = if (edad >= 18) 350000 else 200000
    var descuento = 0.0

    descuento = when (nivelSisben) {
        1 -> {
            if (edad >= 18) 0.4 else 0.6
        }
        2 -> {
            if (edad >= 18) 0.3 else 0.4
        }
        3 -> {
            if (edad >= 18) 0.15 else 0.2
        }
        else -> {
            0.0
        }
    }
    val valorFinal = costoBase - (costoBase * descuento)
    println("Descuento: ${(descuento * 100).toInt()}%")
    println("Valor final a pagar: $valorFinal")
}