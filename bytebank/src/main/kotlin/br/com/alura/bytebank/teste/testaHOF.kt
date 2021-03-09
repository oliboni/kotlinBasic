package br.com.alura.bytebank.teste

import br.com.alura.bytebank.model.Autenticavel
import br.com.alura.bytebank.model.SistemaInterno

fun testaHOF() {
    //    soma(1,5) {
//        println(it)
//    }

    somas(1, 5, (::println))
    somaReceiver(1, 5) {
        println(this)
    }

    val autenticavel = object : Autenticavel {
        val senha = "1234"
        override fun autentica(senha: String): Boolean = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(autenticavel, "1234", autenticado = {
        println("Realizar pagamento")
    })

    sistemaInterno.entraReceiver(autenticavel,"1234", autenticado = {
        pagamento()
    })
}

fun somas(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("Aqui")
    resultado(a + b)
    println("depois")
}

fun somaReceiver(a: Int, b: Int, resultado: Int.() -> Unit){
    println("Aqui")
    val total = a + b
    total.resultado()
    println("depois")
}