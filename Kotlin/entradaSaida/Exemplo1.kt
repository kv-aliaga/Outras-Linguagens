package entradaSaida

fun main() {
    print("Digite a quantidade de km andados: ")
    val qtdKm = readln().toDouble()
    print("Digite a quantidade de horas: ")
    val qtdHoras = readln().toDouble()

    val media = qtdKm / qtdHoras

    println("A média de quilômetros é $media km/h")
}