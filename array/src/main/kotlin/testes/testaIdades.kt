package testes

fun testaIdades() {
    /*val idades = IntArray(5)
    idades[0] = 20
    idades[1] = 19
    idades[2] = 25
    idades[3] = 17
    idades[4] = 18
*/
    val idades = intArrayOf(20, 19, 25, 17, 18)

    var maiorIdade = 0
    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }
    println(maiorIdade)

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }
    println(menorIdade)


    val idadess = intArrayOf(10,70, 12, 18, 33, 40, 67)
    println(idadess.maxOrNull())
    println(idadess.minOrNull())
    println(idadess.average())
    println(idadess.sum())
//    função all retorna True se todos os valores atenderem ao requisito dentro do { }
    println(idadess.all { it >= 18 })
//    função any retorna True se ao menos um dos valores atenderem ao requisito dentro do { }
    println(idadess.any{it >= 18})
//    Retorna uma lista com os valores que atendem ao requisito dentro do { }
    println(idadess.filter { it >= 18 })
//    Find encontra alguem com determinaod valor, sempre retorna o primeiro elemento que atender a busca
    println(idadess.find { it == 18 })
}