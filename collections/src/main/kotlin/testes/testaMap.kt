package testes


fun testeComportamentosMap() {
    //    val pedidos = mapOf(Pair(1,20.0), Pair(2,58.0), 3 to 32.9)
    val pedidos = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 58.0),
        3 to 32.9,
        4 to 49.0,
        5 to 150.0,
        6 to 80.0,
        7 to 326.0,
        8 to 58.0
    )
    testaMap(pedidos)
}

private fun testaMap2(pedidos: MutableMap<Int, Double>) {
    //    getValue, se a chave não existe devolve uma exception
    val getvalue = pedidos.getValue(4)
    println(getvalue)
    val getOrElse = pedidos.getOrElse(4, {
        "Não existe o pedido"
    })
    println(getOrElse)
    println(pedidos.getOrDefault(1, -1.0))
    println(pedidos.getOrDefault(0, -1.0))

//    Interações no mapa somente nas chaves ou nos pedidos, pode ser feito em ambos
    println(pedidos.keys)
    for (numeroPedidos in pedidos.keys) {
        println("Pedido: $numeroPedidos")
    }

//
    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50.0
    }
    println(pedidosFiltrados)

    println(pedidos.filterKeys { numero -> numero % 2 == 0 })
    println(pedidos.filterValues { valor -> valor > 50 })

    println(pedidos + Pair(8, 18.2))
    println(pedidos)

    println(pedidos - 6)
    println(pedidos - listOf(6, 3, 8))
    println(pedidos)

//    pedidos.putAll(setOf(8 to 18.2, 9 to 84.3))
    pedidos += setOf(8 to 18.2, 9 to 84.3)
    println(pedidos)
}

fun testaMap(pedidos: MutableMap<Int, Double>) {
    val pedido = pedidos[1]
    pedido?.let { println("pedido $it") }

//  O entry é como se fosse uma interface dentro de uma interface do map
    for (p in pedidos) {
        print("Pedido ${p.key}")
        println(" valor ${p.value}")
    }

//    Insere
    pedidos[4] = 70.0
    println(pedidos)
//    Insere
    pedidos.put(5, 80.0)
    println(pedidos)
//    Atualiza
    pedidos.put(1, 23.0)
    println(pedidos)
//    insere se não existe
    pedidos.putIfAbsent(1, 50.0)
    println(pedidos)
//    insere se não existe
    pedidos.putIfAbsent(6, 50.0)
    println(pedidos)
//    Remove
    pedidos.remove(6)
    println(pedidos)
//    Remove se o valor for igual
    pedidos.remove(4, 69.0)
    println(pedidos)
//    Remove através da chave, igual ao remove normal
    pedidos.keys.remove(1)
    println(pedidos)
//    Remove através do valor, porém se existir mais de 1 igual, ele remove apenas o primeiro que achar
    pedidos.values.remove(58.0)
    println(pedidos)
//    Remove através da chave, igual o remove e o key.remove
    pedidos -= 7
    println(pedidos)
}

