package br.com.alura.bytebank.model



abstract class Conta(
    var titular: Cliente,
    val numeroConta: Int
) : Autenticavel {

    var saldo = 0.0
        protected set

    companion object Contador {
        var total = 0
            private set
    }

    init {
        total++
    }

    override fun toString(): String {
        return "Titular $titular \n" +
                "br.com.alura.bytebank.model.Conta $numeroConta \n" +
                "Saldo $saldo"
    }

    fun deposito(valor: Double) {
        this.saldo += valor;
    }

    abstract fun saque(valor: Double)

}