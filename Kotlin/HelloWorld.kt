    fun main(){
        // Hello World!
        println("Hello World!")

        // Variáveis
        val nome = "Jones" // val -> constante (imutável)
        var idade = 15 // var -> variável (mutável)
        println("Nome: $nome, Idade: $idade")

        // Tipos de dados
        // val <nomeVar>: <tipoVar> = <valorVar>
        var x: Int = 10
        var y: Double = 6.9
        var apelido: String = "Bia"
        var aprovado: Boolean = true

        // Condicionais
        if (idade >= 18) {
            println("Maior de idade")
        } else {
            println("Menor de idade")
        }

        var resultado = if (idade >= 18) "Maior de idade" else "Menor de idade"
        println(resultado)

        // Laços de repetição
        for (i in 1..5){
            print(i, )
        }
        var i = 1
        println()
        while (i <= 5){
            print(i)
            i++
        }

        // Funções
        fun somar(a: Int, b: Int): Int{
            return a + b
        }
        var r = somar(5, 3)
        println(r)

        // Listas
        val frutas = listOf("Maçã", "Banana", "Uva") // comportamento de tuplas
        for (f in frutas) {
            println(f)
        }

        val numeros = mutableListOf(1, 2, 3) // comportamento de listas
        numeros.add(4)
        println(numeros)
    }