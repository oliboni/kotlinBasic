package br.com.alura.bytebank.teste

import br.com.alura.bytebank.model.Endereco
import java.lang.NumberFormatException

fun testaExpressao() {
    println("Inicio main()")

    testaExpressoes()

    funcao1()
    println("Fim main()")
}

fun testaExpressoes() {
    val entrada: String = "1.9"

    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Erro de conversão!")
        null
    }

//    Tanto o try quanto o if e o when são expressões
    val valorComTaxa: Double = valorComTaxa(valorRecebido)

    val valorComTaxa2: Double = when {
        valorRecebido != null -> {
            valorRecebido * 0.2
        }
        else -> {
            0.0
        }
    }

    println("Valor com taxa: $valorComTaxa")
    println("Valor com taxa2: $valorComTaxa2")
}

private fun valorComTaxa(valorRecebido: Double?) = if (valorRecebido != null) {
    valorRecebido * 0.1
} else {
    0.0
}

fun funcao1() {
    println("Inicio funcao1()")
    funcao2()
    println("Fim funcao1()")
}

fun funcao2() {
    println("Inicio funcao2()")
    try {
        for (i in 1..5) {
            println(i)

            val endereco = Any()
            endereco as Endereco
        }
    } catch (e: ClassCastException) {
        println(e.message)
        println(e.stackTrace)
        println(e.cause)
    }
    println("Fim funcao2()")
}