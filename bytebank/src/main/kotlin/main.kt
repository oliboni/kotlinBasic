fun main() {
    println("Bem vindo ao Bytebank")
    val conta = Conta("Rodrigo", 1000)
    conta.deposito(100.0)


    val conta2 = Conta("Kachi", 1001)
    conta2.deposito(50.0)

    println("_________________________")
    println("$conta")
    println("_________________________")

    println("_________________________")
    println("$conta2")
    println("_________________________")

    conta.deposito(100.0)
    println("Saldo: ${conta.saldo}")

    conta2.deposito(50.0)
    println("Saldo: ${conta2.saldo}")

    conta.saque(50.0)
    conta.saque(300.0)

    println("Saldo conta ${conta.titular}: ${conta.saldo}")
    println("Saldo conta ${conta2.titular}: ${conta2.saldo}")

    if (conta.transferencia(conta2, 100.0)) {
        println("Transferência concluída com sucesso!")
    } else {
        println("Ocorreu algum erro na transferência!")
    }

    println("Saldo conta ${conta.titular}: ${conta.saldo}")
    println("Saldo conta ${conta2.titular}: ${conta2.saldo}")

}

class Conta(
    var titular: String,
    val numeroConta: Int
) {

//    var titular = titular
//    var numeroConta = numeroConta
    var saldo = 0.0
        private set

//    constructor(titular: String, numeroConta: Int){
//        this.titular = titular
//        this.numeroConta = numeroConta
//    }

    /**
     * Não é muito "Idiomático" em kotlin usar getter e setter
     */

//    fun getSaldo(): Double{
//        return this.saldo
//    }
//
//    fun getTitular(): String{
//        return this.titular
//    }
//
//    fun getNumeroConta(): Int{
//        return this.numeroConta
//    }
//
//    fun setSaldo(valor: Double){
//        this.saldo = valor;
//    }
//
//    fun setTitular(titular: String){
//        this.titular = titular;
//    }
//
//    fun setNumeroConta(nroConta : Int){
//        this.numeroConta = nroConta;
//    }

    override fun toString(): String {
        return "Titular $titular \n" +
                "Conta $numeroConta \n" +
                "Saldo $saldo"
    }

    fun deposito(valor: Double) {
        println("Depósito na conta $titular")
        this.saldo += valor;
    }

    fun saque(valor: Double) {
        if (this.saldo >= valor) {
            println("Saque da conta $titular no valor de $valor")
            saldo -= valor
        } else {
            println("Saldo insuficiente!")
        }
    }

    fun transferencia(conta: Conta, valor: Double): Boolean {
        if (saldo < valor) {
            println("Saldo insuficiente!")
            return false
        }

        println("Transferido $valor para conta : titular: ${conta.titular}, conta: ${conta.numeroConta} ")
        saldo -= valor
        conta.recebeTransf(valor);
        return true
    }

    private fun recebeTransf(valor: Double) {
        println("Transferência recebida no valor de $valor")
        this.saldo += valor;
    }

}

fun testaCopiaEReferencia() {

    val numeroX = 10
    var numeroY = numeroX

    numeroY++

    println("NumeroX $numeroX")
    println("NumeroY $numeroY")

    val contaJoao = Conta("João", 1001)
    var contaMaria = contaJoao
    contaMaria.titular = "Maria"

    println("Titular conta Joao: ${contaJoao.titular}")
    println("Titular conta Maria: ${contaMaria.titular}")

}

fun testaLacos() {
    /**
     * var = permite mudar o valor da variável
     * val = não permite mudar o valor da variável
     */
    var i = 0
    while (i < 5) {
        val titular = "Rodrigo $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("___________________")
        println("Titular: $titular")
        println("Conta: $numeroConta")
        println("Saldo: $saldo")
        println("___________________")

        testaCondicoes(saldo)
        i++
    }
    /*
    for (i in 1..5) {
        val titular = "Rodrigo $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("___________________")
        println("Titular: $titular")
        println("Conta: $numeroConta")
        println("Saldo: $saldo")
        println("___________________")

        testaCondicoes(saldo)
    }*/

    /**
     *  downTo é usado para loops onde o número inicial é maior que o final
     *  step é usado para pular registros de x em x valores
     *
     */
    /*for (i in 5 downTo 1 step 2) {

        if (i == 3){
            break
        }

        val titular = "Rodrigo $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("___________________")
        println("Titular: $titular")
        println("Conta: $numeroConta")
        println("Saldo: $saldo")
        println("___________________")

        testaCondicoes(saldo)
    }*/
}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> {
            println("A conta está positiva!")
        }
        saldo == 0.0 -> println("A conta está zerada!")
        else -> println("A conta está negativa!")
    }
}