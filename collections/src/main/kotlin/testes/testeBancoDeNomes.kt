package testes

fun testeBancoDeNomes() {
    val bancoDeNomes = BancoDeNomes()

    println(bancoDeNomes.nomes)
    bancoDeNomes.salva("Rodrigo")
    println(bancoDeNomes.nomes)

    /**
     *  fazendo cast e a copia por referência, podemos burlar e alterar os dados
     *  Para resolver o problema foi preciso adicionar o .toList() na classe do Banco de dados!
     */
//    val nomesSalvos: MutableCollection<String> = bancoDeNomes.nomes as MutableCollection<String>
//    println(nomesSalvos)
//
//    nomesSalvos.add("Kachi")
//    println(nomesSalvos)
//    println(bancoDeNomes.nomes)

    val nomesSalvos: Collection<String> = bancoDeNomes.nomes
    println(nomesSalvos)

//    nomesSalvos.add("Kachi")
    bancoDeNomes.salva("Kachi")
    println(nomesSalvos)
    println(bancoDeNomes.nomes)
}

class BancoDeNomes{
    val nomes: Collection<String> get() = Companion.dados.toList()

    fun salva(nome: String){
        Companion.dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}