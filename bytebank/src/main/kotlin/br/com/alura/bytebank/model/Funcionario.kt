package br.com.alura.bytebank.model

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
){
    abstract val bonificacao: Double

    override fun toString(): String {
        return "br.com.alura.bytebank.model.Funcionario(nome='$nome', cpf='$cpf', salario=$salario)"
    }

}