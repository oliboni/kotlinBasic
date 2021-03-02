fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente("Rodrigo", 100)
    contaCorrente.deposito(2000.0)
    val contaPoupanca = ContaPoupanca("Kachi", 101)
    contaPoupanca.deposito(2000.0)
    val contaSalario = ContaSalario("João", 102)
    contaSalario.deposito(1000.0)


    contaCorrente.transferencia(contaPoupanca, 200.0)
    contaCorrente.transferencia(contaSalario, 200.0)
    println("Saldo conta corrente após realizar transferências: ${contaCorrente.saldo}")
    println("Saldo conta poupança após receber transferência..: ${contaPoupanca.saldo}")
    println("Saldo conta salario após receber transferência...: ${contaSalario.saldo}")

    println("-------------------------------------------------------------------------------------")

    contaCorrente.saque(200.0)
    contaPoupanca.saque(200.0)
    contaSalario.saque(50.0)
    println("Saldo conta corrente após saque: ${contaCorrente.saldo}")
    println("Saldo conta poupança após saque: ${contaPoupanca.saldo}")
    println("Saldo conta salario após saque.: ${contaSalario.saldo}")

    println("-------------------------------------------------------------------------------------")

    contaCorrente.transferencia(contaPoupanca, 100.0)
    println("Saldo conta corrente após transferência para conta poupança: ${contaCorrente.saldo}")
    println("Saldo conta poupança após receber transferência da corrente: ${contaPoupanca.saldo}")

    println("-------------------------------------------------------------------------------------")

    contaPoupanca.transferencia(contaCorrente, 100.0)
    println("Saldo conta poupança após transferência para conta corrente: ${contaCorrente.saldo}")
    println("Saldo conta corrente após receber transferência da poupança: ${contaPoupanca.saldo}")

    println("-------------------------------------------------------------------------------------")
}