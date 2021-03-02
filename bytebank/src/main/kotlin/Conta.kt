abstract class Conta(
    var titular: String,
    val numeroConta: Int
) {

    var saldo = 0.0
        protected set

    override fun toString(): String {
        return "Titular $titular \n" +
                "Conta $numeroConta \n" +
                "Saldo $saldo"
    }

    fun deposito(valor: Double) {
        this.saldo += valor;
    }

    abstract fun saque(valor: Double)




}