package br.com.alura.bytebank.model

class SistemaInterno {
    fun entra(admin: Autenticavel, senha: String){
        if(admin.autentica(senha)){
            println("Bem vindo ao Bytebank")
        } else{
            println("Falha ao fazer login, confira os dados de acesso!")
        }
    }
}