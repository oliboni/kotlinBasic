fun main(args: Array<String>) {
    val pedidos = listOf(
        Pedido(1,20.0),
        Pedido(2,30.0),
        Pedido(3,40.0),
        Pedido(4,100.0),
        Pedido(5,80.0),
        Pedido(6,268.0)
    )
    println(pedidos)
//    val pedidosMapeados = pedidos.associate { pedido ->
//        Pair(pedido.numero, pedido) // ou pedido.numero to pedido
//    }
    val pedidosMapeados = pedidos.associateBy { pedido -> pedido.numero }
    println(pedidosMapeados)
//    retorna um booleano para a chave que é o próprio pedido
    val pedidosFreteGratis = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(1, 20.0)])

    val mapa = pedidos.associateBy { pedido -> pedido.valor > 50.0 }
    println(mapa)

    val pedidosFretesGratisAgrupados = pedidos.groupBy { pedido ->
        pedido.valor > 50.0
    }

    println(pedidosFretesGratisAgrupados)
    println(pedidosFretesGratisAgrupados[true])

    val nomes = listOf("Rodrigo", "Kachi", "Luci", "Rogerio", "Luana", "Leonardo", "Roque", "Robson")
    val agenda = nomes.groupBy { nome -> nome.first() }

    println(agenda)

}

data class Pedido(val numero: Int, val valor:Double )