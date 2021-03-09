package br.com.alura.bytebank

import br.com.alura.bytebank.model.Cliente
import br.com.alura.bytebank.model.ContaPoupanca
import br.com.alura.bytebank.model.Endereco
import br.com.alura.bytebank.teste.testaHOF

fun main() {
    testaHOF()
}

fun testaRun() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12
    println("Taxa mensal: $taxaMensal")

    val novaConta = Cliente(
        "Rodrigo",
        "000.000.000-00",
        Endereco(),
        "1234"
    ).let { clienteNovo ->
        ContaPoupanca(clienteNovo, 1000)
    }

    novaConta.run {
        deposito(1000.0)
        saldo * taxaMensal
    }.let(::println)

    val rendimentoAnual = run {
        var saldo = novaConta.saldo
        repeat(12) {
            saldo += saldo * taxaMensal
        }

        saldo
    }

    println("Rendimento Anual: $rendimentoAnual")
}

fun testaWith() {
    with(Endereco()) {
        logradouro = "Rua imbituba"
        numero = 1995
        bairro = "Cristo Rei"
        cidade = "Chapecó"
        estado = "SC"
        cep = "89810-150"
        complemento = "E"
        completo()
    }.let(::println)
}
