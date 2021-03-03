package br.com.alura.bytebank.model

interface Autenticavel {

    fun autentica(senha: String) : Boolean
}