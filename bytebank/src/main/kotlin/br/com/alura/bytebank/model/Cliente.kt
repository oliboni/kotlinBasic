package br.com.alura.bytebank.model

class Cliente(
    var nome: String,
    val cpf: String,
    var endereco: Endereco = Endereco(),
    private val senha: String
) : Autenticavel {
    override fun autentica(senha: String) : Boolean{
        if (this.senha == senha) {
            return true
        }
        return false
    }

}