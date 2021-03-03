package br.com.alura.bytebank.model

class ContaCorrente(
    titular: Cliente,
    numeroConta: Int
) : Conta(
    titular,
    numeroConta
), Transferencia {
    override fun saque(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
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