package entradaSaida

fun main(){
    print("Digite a altura do aquário (cm): ")
    val altura = readln().toDouble()
    print("Digite o comprimento do aquário (cm): ")
    val comprimento = readln().toDouble()
    print("Digite a profundidade do aquário (cm): ")
    val profundidade = readln().toDouble()

    val volume = (altura * comprimento * profundidade) / 1000

    print("O volume do aquário é de: $volume l")
}