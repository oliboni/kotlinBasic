package br.com.alura.bytebank.teste

import br.com.alura.bytebank.model.Endereco


fun testaFuncoesEscopo() {
    //    val endereco = Endereco("Rua imbituba",966,"Cristo Rei")
//    val enderecoUpperCase = "${endereco.logradouro}, ${endereco.numero}, ${endereco.bairro}".toUpperCase()
//    println(enderecoUpperCase)

    Endereco(
        "Rua imbituba",
        966,
        "Cristo Rei"
    ).let { endereco ->
        "${endereco.logradouro}, ${endereco.numero}, ${endereco.bairro}".toUpperCase()
    }.let(::println)

    Endereco(
        "Rua imbituba",
        966,
        "Cristo Rei"
    ).apply {
        cidade = "Chapecó"
    }.let { endereco ->
        "${endereco.logradouro}, ${endereco.numero}, ${endereco.bairro},${endereco.cidade}".toUpperCase()
    }.let(::println)

    Endereco(
        "Rua imbituba",
        966,
        "Cristo Rei"
    ).run {
        "$logradouro, $numero, $bairro".toUpperCase()
    }.let(::println)

    listOf(
        Endereco(logradouro = "Casa"),
        Endereco(),
        Endereco(logradouro = "Ap")
    )
        .filter { endereco -> endereco.logradouro.isNotEmpty() }
        .let(::println)
}


