package entradaSaida

fun main(){
    print("Digite um número: ")
    val n = readln().toInt()

    println("${n - 1} -> $n -> ${n + 1}")
}