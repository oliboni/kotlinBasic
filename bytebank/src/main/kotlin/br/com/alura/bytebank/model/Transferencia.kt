package br.com.alura.bytebank.model

interface Transferencia {
    fun transferencia(conta: Conta, valor: Double) : Boolean
}