package br.com.alura.bytebank.teste

import br.com.alura.bytebank.model.Autenticavel
import br.com.alura.bytebank.model.SistemaInterno

fun testaObjectExpression() {
    val rodrigo = object : Autenticavel {
        val nome: String = "Rodrigo"
        val cpf: String = "111.111.111-11"
        val senha: String = "123456"

        override fun autentica(senha: String) = this.senha == senha
    }

    println(rodrigo.nome)
    println(rodrigo.autentica("123456"))

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(rodrigo, "123456")
}