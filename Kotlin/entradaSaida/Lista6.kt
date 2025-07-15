package entradaSaida

fun main(){
    print("Digite seu saldo: R$")
    var saldo = readln().toDouble()
    saldo += (saldo * 0.03)

    println("Seu saldo com 3% de reajuste é igual a: R$$saldo")
}