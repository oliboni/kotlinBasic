package testes

fun testeColecao() {
    val nomes: Collection<String> = listOf("Rodrigo", "Kachi", "Joao", "Maria")
    val nomes1: Iterable<String> = listOf("Rodrigo", "Kachi", "Joao", "Maria")
    val nomes2: Collection<String> = setOf("Rodrigo", "Kachi", "Joao", "Maria")
    val nomes3: Iterable<String> = setOf("Rodrigo", "Kachi", "Joao", "Maria")
    println(nomes)
    println(nomes1)
    println(nomes2)
    println(nomes3)

//    for(nome in nomes1.iterator()) - Por de baixo dos panos, o iterator do "ITERABLE" é utilizado
    for (nome in nomes1) {
        print("${nome} ")
    }
    println()
    println("Tem o nome Kachi? ${nomes1.contains("Kachi")}")
//    println("Tamanho da coleção: ${nomes1.size}") - Iterable não contem o size, algo que vem do Collection
    println("Tamanho da coleção: ${nomes.size}")
}