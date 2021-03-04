package br.com.alura.bytebank

import br.com.alura.bytebank.model.Endereco

fun main() {
//    var enderecoNulo: Endereco? = null
//    var endereco = Endereco()
//
//    endereco.logradouro
//  !! = operador non-null assertion
//    enderecoNulo!!.logradouro


    var enderecoNulo: Endereco? = Endereco(logradouro = "rua vergueiro")
    val logradouroNovo: String? = enderecoNulo?.logradouro
//    enderecoNulo?.logradouro?.length
    enderecoNulo?.let {
        println(it.logradouro.length)
        val tamanhoCOmplemento: Int = it.complemento?.length ?:0
        println(tamanhoCOmplemento)
    }
}


