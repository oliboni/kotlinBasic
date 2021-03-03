import br.com.alura.bytebank.model.Analista
import br.com.alura.bytebank.model.CalculadoraBonificacao
import br.com.alura.bytebank.model.Diretor
import br.com.alura.bytebank.model.Gerente

fun testaFuncionarios() {
    val joao = Analista(nome = "João", cpf = "111.111.111-11", salario = 126.52)

    println("--------------------------------------")
    println(joao)
    println("Bonificação ${joao.bonificacao}")

    println("--------------------------------------")
    val kachi = Gerente("Kachi", "222.222.222-22", 3000.00, "256")
    println(kachi)
    println("Bonificação ${kachi.bonificacao}")

    println("--------------------------------------")
    val rodrigo = Diretor("Rodrigo", "333.333.333-33", 3489.00, "125", 250.0)
    println(rodrigo)
    println("Bonificação ${rodrigo.bonificacao}")
    println("Valor Plr: ${rodrigo.plr()}")


    println("--------------------------------------")
    val calculadoraBonificacao = CalculadoraBonificacao()
    calculadoraBonificacao.registra(rodrigo)
    calculadoraBonificacao.registra(kachi)
    calculadoraBonificacao.registra(joao)

    println("Total bonificação ${calculadoraBonificacao.total}")
}