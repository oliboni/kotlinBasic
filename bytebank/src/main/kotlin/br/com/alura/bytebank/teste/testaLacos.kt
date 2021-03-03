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
        println("br.com.alura.bytebank.model.Conta: $numeroConta")
        println("Saldo: $saldo")
        println("___________________")

        testaCondicoes(saldo)
        i++
    }


    /**
     *  downTo é usado para loops onde o número inicial é maior que o final
     *  step é usado para pular registros de x em x valores
     *
     */

}