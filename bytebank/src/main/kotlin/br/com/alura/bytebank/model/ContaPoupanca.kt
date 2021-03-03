package br.com.alura.bytebank.model

class ContaPoupanca(
    titular: Cliente,
    numeroConta: Int
) : Conta(
    titular,
    numeroConta
), Transferencia {
    override fun saque(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        } else {
            println("Saldo insuficiente!")
        }
    }

    override fun transferencia(conta: Conta, valor: Double): Boolean {
        if (saldo < valor) {
            println("Saldo insuficiente!")
            return false
        }

        saldo -= valor
        conta.deposito(valor);
        return true
    }
}