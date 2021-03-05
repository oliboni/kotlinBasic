package testes

import br.com.alura.list.listaLivro
import model.Prateleira

fun testaPrateleira(){
    val prateleira = Prateleira("Literatura", listaLivro())

    val porAutor = prateleira.organizarPorAutor()
    val porAnoPublicacao= prateleira.organizarPorAnoPublicacao()

    porAutor.imprimeComMarcadores()
    porAnoPublicacao.imprimeComMarcadores()
}