package entradaSaida
import java.net.URL
import kotlin.math.abs

fun main(){
    val cotacaoUSBR = """"bid":"(\d+(\.\d+)?)"""".toRegex()
        .find(URL("https://economia.awesomeapi.com.br/json/last/USD-BRL").readText())
        ?.groupValues?.get(1)?.toDouble() ?: 0.0
    println(cotacaoUSBR)
    val taxaUS = 20
    val pacoteViagemUS = 200
    print("Digite a quantidade de pacotes de viagem: ")
    val qtdPacotes = readln().toInt()

    val totalUS = (taxaUS * qtdPacotes) + (pacoteViagemUS * qtdPacotes)
    val totalBR = totalUS * cotacaoUSBR

    println("Comprando $qtdPacotes pacotes de viagem, você gastará: ")
    println("R$ %.2f".format(totalBR).replace(",", "."))
    println("US$ $totalUS")

}