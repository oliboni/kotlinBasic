abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
){
    abstract val bonificacao: Double

    override fun toString(): String {
        return "Funcionario(nome='$nome', cpf='$cpf', salario=$salario)"
    }

}