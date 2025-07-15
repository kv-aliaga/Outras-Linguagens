package entradaSaida

fun main(){
    print("Digite o primeiro número: ")
    val n1 = readln().toDouble()
    print("Digite o segundo número: ")
    val n2 = readln().toDouble()

    // mostrando resultados
    println("SOMA: $n1 + $n2 = ${n1 + n2}")
    println("PRODUTO: $n1 * $n2 = ${n1 * n2}")
    println("DIFERENÇA: $n1 - $n2 = ${n1 - n2}")
    println("QUOCIENTE: $n1 / $n2 = ${n1 / n2}")
}