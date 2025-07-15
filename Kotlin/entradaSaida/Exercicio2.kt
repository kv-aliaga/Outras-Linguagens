package entradaSaida

fun main(){
    val banhoDezMin = 10
    var litrosPorMin = 120
    litrosPorMin /= banhoDezMin
    print("Digite a quantidade de minutos do banho: ")
    val qtdMinutos = readln().toInt()

    val totalLitros = qtdMinutos * litrosPorMin

    print("Um banho de $qtdMinutos gasta $totalLitros l")
}