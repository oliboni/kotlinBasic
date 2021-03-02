class Cliente(
    val nome: String,
    val cpf: String,
    private val senha: String
) : Autenticavel{
    override fun autentica(senha: String) : Boolean{
        if (this.senha == senha) {
            return true
        }
        return false
    }

}