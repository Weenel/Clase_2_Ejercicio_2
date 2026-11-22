fun main() {
    val temperaturas = listOf(18.0, 21.5, 19.0, 24.0, 17.5)
    var suma = 0.0
    var maximo = temperaturas[0]
    var minimo = temperaturas[0]

    for (temperatura in temperaturas) {
        suma += temperatura
        if (temperatura > maximo) maximo = temperatura
        if (temperatura < minimo) minimo = temperatura
    }

    val media = suma / temperaturas.size
    println("Suma: %.2f °C".format(suma))
    println("Media: %.2f °C".format(media))
    println("Máximo: %.2f °C".format(maximo))
    println("Mínimo: %.2f °C".format(minimo))
}