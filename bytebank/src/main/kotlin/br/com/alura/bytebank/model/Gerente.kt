package br.com.alura.bytebank.model

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: String
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
) {



    override val bonificacao: Double
        get() {
            return salario * 0.3;
        }
}