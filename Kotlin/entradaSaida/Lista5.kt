package entradaSaida

fun main() {
    print("Digite o primeiro número: ")
    val n1 = readln().toDouble()
    print("Digite o segundo número: ")
    val n2 = readln().toDouble()
    print("Digite o terceiro número: ")
    val n3 = readln().toDouble()

    val media = (n1 + n2 + n3) / 3

    println("A média aritmética é: $media")
}