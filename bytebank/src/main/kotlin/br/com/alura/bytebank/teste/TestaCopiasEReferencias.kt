import br.com.alura.bytebank.model.Cliente
import br.com.alura.bytebank.model.ContaCorrente
import br.com.alura.bytebank.model.Endereco

fun testaCopiaEReferencia() {

    val numeroX = 10
    var numeroY = numeroX

    numeroY++

    println("NumeroX $numeroX")
    println("NumeroY $numeroY")

    val joao = Cliente("João", "111.111.111-11", Endereco(),"123")
    val contaJoao = ContaCorrente(joao, 1001)
    var contaMaria = contaJoao
    contaMaria.titular.nome = "Maria"

    println("Titular conta Joao: ${contaJoao.titular.nome}")
    println("Titular conta Maria: ${contaMaria.titular.nome}")
    println("Endereco: ${contaMaria.titular.endereco}")

}