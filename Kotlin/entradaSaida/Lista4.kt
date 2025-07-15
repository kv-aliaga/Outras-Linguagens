package entradaSaida

fun main(){
    // entrada de dados
    print("Digite quantos anos você tem: ")
    var anos = readln().toInt()
    print("Digite quantos meses faltam para seu próximo aniversário: ")
    var meses = readln().toInt()
    print("Digite quantos dias faltam para o dia do próximo mês com a mesmo dia do seu aniversário: ")
    val dias = readln().toInt()

    // atribuindo valores
    anos *= 365
    meses *= 30

    println("Desde que você nasceu se passaram: ${dias + meses + anos} dias")
}