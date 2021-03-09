package br.com.alura.bytebank.model

class SistemaInterno {
    fun entra(admin: Autenticavel, senha: String, autenticado: () -> Unit = {}){
        if(admin.autentica(senha)){
            println("Bem vindo ao Bytebank")
            autenticado()
        } else{
            println("Falha ao fazer login, confira os dados de acesso!")
        }
    }

    fun entraReceiver(admin: Autenticavel, senha: String, autenticado: SistemaInterno.() -> Unit = {}){
        if(admin.autentica(senha)){
            println("Bem vindo ao Bytebank")
            autenticado()
        } else{
            println("Falha ao fazer login, confira os dados de acesso!")
        }
    }

    fun pagamento(){
        println("Realizando pagamento")
    }
}