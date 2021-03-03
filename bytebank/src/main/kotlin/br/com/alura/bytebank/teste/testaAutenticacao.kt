import br.com.alura.bytebank.model.*

fun testaAutenticacao() {
    val gerente = Gerente("kachi", "111.111.111-11", 2000.0, "senhaForte")
    val diretor = Diretor("Rodrigo", "222.222.222-22", 3000.0, "senhaMaisForte", 250.0)
    val cliente = Cliente("ClienteChato", "333.333.333-33",Endereco(),"senhaQualquer")

    val sistema = SistemaInterno()

    sistema.entra(gerente, "senhaForte")
    sistema.entra(gerente, "senhaMaisForte")
    sistema.entra(diretor, "senhaMaisForte")
    sistema.entra(cliente,"senhaQualquer")


}