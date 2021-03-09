package br.com.alura.bytebank.teste


fun testaFuncaoAnonima() {
    val minhaFuncAnonima = fun(a: Int, b: Int): Int {
        println("Teste Func. Anônima")
        return a + b
    }
    println(minhaFuncAnonima(20, 30))
    val calculadoraBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if (salario > 1000.0) {
            return salario + 50.0
        }
        return salario + 100.0
    }

    println(calculadoraBonificacaoAnonima(1100.0))
}

fun testaLambda() {
    //    testaTipoFuncReferenciaEClasse()

//    Função lambda e função anônima
//    val minhaFuncLambda: () -> Unit = {
//    val minhaFuncLambda = {
//    val minhaFuncLambda: (Int, Int) -> Int = { a, b ->
    val minhaFuncLambda = { a: Int, b: Int ->
        println("Teste do Lambda")
        a + b
    }

    println(minhaFuncLambda(5, 5))

    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if (salario > 1000.0) {
            return@lambda salario + 50.0
        }
        salario + 100.0
    }

    println(calculaBonificacao(1000.0))
}

fun testaTipoFuncReferenciaEClasse() {
    val minhaFuncao = ::soma
    println(minhaFuncao(3, 3))

//    val classe: () -> Unit = Teste()
    val classe: (Int, Int) -> Int = Soma()
    println(classe(minhaFuncao(3, 3), 12))
}

fun soma(a: Int, b: Int): Int = a + b

class Soma() : (Int, Int) -> Int {
    override fun invoke(p1: Int, p2: Int): Int {
        return p1 + p2
    }


}