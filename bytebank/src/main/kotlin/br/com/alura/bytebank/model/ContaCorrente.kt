package br.com.alura.bytebank.model

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException

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

    override fun autentica(senha: String): Boolean {
        return titular.autentica(senha)
    }

    override fun transferencia(conta: Conta, valor: Double, senha: String) {
        if (!autentica(senha)){
            throw FalhaAutenticacaoException()
        }
        if (saldo < valor) {
            println("Saldo insuficiente!")
            throw SaldoInsuficienteException("O Saldo é insuficiente!(saldo: $saldo")
        }

        saldo -= valor
        conta.deposito(valor);
    }

}