package testes

fun testeRange() {
    val serie: IntRange = 1.rangeTo(10)
    for (s in serie) {
        print("$s ")
    }
    println()
    val numerosPares = 0..100 step 2
    for (numeroPar in numerosPares) {
        print("$numeroPar ")
    }
    println()
    val numerosParess = 0.until(100) step 2
    for (numeroPar in numerosParess) {
        print("$numeroPar ")
    }
    println()
    val numerosParesReversos = 100 downTo 0 step 2
    numerosParesReversos.forEach { numeroPar ->
        print("$numeroPar ")
    }

    val intervalo = 1500..5000
    val salario = 5001

    if (salario in intervalo) {
        println()
        println("Ta memo")
    } else {
        println()
        println("Ta não")
    }

    val alfabeto = 'a'..'z'
    println('k' in alfabeto)
    println('K' in alfabeto)
}

