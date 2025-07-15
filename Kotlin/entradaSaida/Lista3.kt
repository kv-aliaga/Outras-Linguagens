package entradaSaida

fun main(){
    print("Digite seu peso em kg: ")
    val pesoKg = readln().toDouble()
    print("Digite sua altura em m: ")
    val altura = readln().toDouble()

    val imc = pesoKg / (Math.pow(altura, 2.0))
    println("O seu IMC é de: %.2f".format(imc))
}
