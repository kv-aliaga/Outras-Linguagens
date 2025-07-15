package entradaSaida

fun main(){
    print("Digite a quantidade de bolos por ovo: ")
    val ovosBolo = readln().toInt()
    print("Digite a quantidade de ovos que você tem: ")
    val qtdOvos = readln().toInt()

    val qtdBolos = qtdOvos / ovosBolo

    println("Com $qtdOvos ovos é possível fazer $qtdBolos bolos")
}