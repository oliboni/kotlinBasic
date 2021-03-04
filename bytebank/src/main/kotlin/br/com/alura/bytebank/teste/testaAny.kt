package br.com.alura.bytebank.teste

import br.com.alura.bytebank.model.Endereco

fun testaAny() {
    val endereco = Endereco()
    val enderecoCopia = imprimir(endereco)

    val novoEndereco = Endereco()
    println(endereco.equals(novoEndereco))
}

fun imprimir(valor: Any?): Any? {
    println(valor)
    return valor
}