package br.com.alura.bytebank.model

class CalculadoraBonificacao {
    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario){
        this.total += funcionario.bonificacao;
    }

//    fun registra(gerente: br.com.alura.bytebank.model.Gerente){
//        this.total += gerente.bonificacao;
//    }
//    fun registra(diretor: br.com.alura.bytebank.model.Diretor){
//        this.total += diretor.bonificacao;
//    }


}