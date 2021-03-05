package testes

import model.Livro

fun testaListaLivros(){
    val livro1 = Livro("Livro 1","Autor1", 2009)
    val livro2 = Livro("Livro 2","Rodrigo", 2010)
    val livro3 = Livro("Livro 3","Genival", 2011)
    val livro4 = Livro("Livro 4","Aurelio", 2007, "Dtlantida")

    val livros: MutableList<Livro> = mutableListOf(livro1,livro2,livro3, livro4)
    println(livros.imprimeComMarcadores())

    livros.add(
        Livro("Livro5", "Autor5", 2013,"Cometa")
    )

    println(livros.imprimeComMarcadores())

    livros.remove(livro1)

    println(livros.imprimeComMarcadores())
    println(livros.sorted().imprimeComMarcadores())
    println(livros.sortedBy { it.editora }.imprimeComMarcadores())

    val titulos: List<String> = livros.titulosPorAnoPublicacaoDoAutor("Au")
    println(titulos)
}

fun List<Livro>.imprimeComMarcadores(){
    val textoFormatado = this.joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor}"
    }

    println(" #### LISTA DE LIVROS ####")
    println(textoFormatado)
}

fun MutableList<Livro>.titulosPorAnoPublicacaoDoAutor(prefixoAutor: String)
        : List<String> {
    return this
        .filter { it.autor.startsWith(prefixoAutor) }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }
}