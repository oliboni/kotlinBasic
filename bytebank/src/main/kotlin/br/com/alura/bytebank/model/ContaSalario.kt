package br.com.alura.bytebank.model

class ContaSalario(
    titular: Cliente,
    numeroConta: Int
) : Conta(
    titular,
    numeroConta
){
    override fun saque(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        } else {
            println("Saldo insuficiente!")
        }
    }

}