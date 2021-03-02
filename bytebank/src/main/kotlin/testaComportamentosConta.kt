fun testaComportamentosConta() {
    val conta = ContaCorrente("Rodrigo", 1000)
    conta.deposito(100.0)


    val conta2 = ContaPoupanca("Kachi", 1001)
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

    testaLacos();
}