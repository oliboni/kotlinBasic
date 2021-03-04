import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.model.Cliente
import br.com.alura.bytebank.model.ContaCorrente
import br.com.alura.bytebank.model.ContaPoupanca
import br.com.alura.bytebank.model.Endereco

fun testaComportamentosConta() {
    val rodrigo = Cliente("Rodrigo", "111.111.111-11",Endereco(),"123")
    val conta = ContaCorrente(rodrigo, 1000)
    conta.deposito(100.0)

    val kachi = Cliente("Kachi", "222.222.222-22",Endereco(),"1234")
    val conta2 = ContaPoupanca(kachi, 1001)
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

    try {
        conta.transferencia(conta2, 100.0,"123")
    } catch (e: SaldoInsuficienteException){
        e.printStackTrace()
    }

    println("Saldo conta ${conta.titular}: ${conta.saldo}")
    println("Saldo conta ${conta2.titular}: ${conta2.saldo}")

    testaLacos();
}