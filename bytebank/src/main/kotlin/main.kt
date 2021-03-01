fun main() {
    println("Bem vindo ao Bytebank")
    //  var = permite mudar o valor da variável
    //  val = não permite mudar o valor da variável
    var i = 0
    while ( i < 5){
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
//    for (i in 1..5) {
//        val titular = "Rodrigo $i"
//        val numeroConta = 1000 + i
//        var saldo = i + 10.0
//
//        println("___________________")
//        println("Titular: $titular")
//        println("Conta: $numeroConta")
//        println("Saldo: $saldo")
//        println("___________________")
//
//        testaCondicoes(saldo)
//    }
//    downTo é usado para loops onde o número inicial é maior que o final
//    step é usado para pular registros de x em x valores
//    for (i in 5 downTo 1 step 2) {
//
//        if (i == 3){
//            break
//        }
//
//        val titular = "Rodrigo $i"
//        val numeroConta = 1000 + i
//        var saldo = i + 10.0
//
//        println("___________________")
//        println("Titular: $titular")
//        println("Conta: $numeroConta")
//        println("Saldo: $saldo")
//        println("___________________")
//
//        testaCondicoes(saldo)
//    }
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