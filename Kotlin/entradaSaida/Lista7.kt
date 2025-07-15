package entradaSaida
import java.net.URL

fun main(){
    val salariominimoatual = Regex(""""valor":"(\d+\.\d+)"""")
        .find(URL("https://api.bcb.gov.br/dados/serie/bcdata.sgs.1619/dados/ultimos/1?formato=json").readText())
        ?.groupValues?.get(1)?.toDouble() ?: 1412.00
    print("Digite seu salário: R$")
    val salario = readln().toDouble()
    val qtdSalMin = salario / salariominimoatual

    println("Com um salário de R$$salario,\nVocê ganha %.2f salários mínimos".format(qtdSalMin))
}