import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.model.*

fun testaContasDiferentes() {
    val rodrigo = Cliente("Rodrigo", "111.111.111-11", Endereco(),"123")
    val contaCorrente = ContaCorrente(rodrigo, 100)
    contaCorrente.deposito(2000.0)
    val kachi = Cliente("Kachi", "222.222.222-22",Endereco(),"1234")
    val contaPoupanca = ContaPoupanca(kachi, 101)
    contaPoupanca.deposito(2000.0)
    val joao = Cliente("João", "333.333.333-33",Endereco(),"1234")
    val contaSalario = ContaSalario(joao, 102)
    contaSalario.deposito(1000.0)


    contaCorrente.transferencia(contaPoupanca, 200.0,"123")
    contaCorrente.transferencia(contaSalario, 200.0,"123")
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

    contaCorrente.transferencia(contaPoupanca, 100.0, "123")
    println("Saldo conta corrente após transferência para conta poupança: ${contaCorrente.saldo}")
    println("Saldo conta poupança após receber transferência da corrente: ${contaPoupanca.saldo}")

    println("-------------------------------------------------------------------------------------")

    contaPoupanca.transferencia(contaCorrente, 100.0,"1234")
    println("Saldo conta poupança após transferência para conta corrente: ${contaCorrente.saldo}")
    println("Saldo conta corrente após receber transferência da poupança: ${contaPoupanca.saldo}")

    println("-------------------------------------------------------------------------------------")

    try {
        contaCorrente.transferencia(contaPoupanca, 1400.0,"1234")
    } catch (e: SaldoInsuficienteException){
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException){
        e.printStackTrace()
    } catch (e: Exception) {
        e.printStackTrace()
    }
    println("Saldo conta corrente após transferência para conta poupança: ${contaCorrente.saldo}")
    println("Saldo conta poupança após receber transferência da corrente: ${contaPoupanca.saldo}")

    println("-------------------------------------------------------------------------------------")
    println("Total de contas: ${Conta.total}")

}