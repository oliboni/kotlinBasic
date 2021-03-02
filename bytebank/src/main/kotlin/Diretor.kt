class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: String,
    var percentPlr: Double
): FuncionarioAdmin(
    nome,
    cpf,
    salario,
    senha
) {

    override val bonificacao: Double
        get() {
            return (salario * 0.3) + plr();
        }

    fun plr(): Double {
        return salario * (percentPlr/100);
    }

    override fun toString(): String = "Funcionario(nome='$nome', cpf='$cpf', salario=R$$salario, plr=$percentPlr%)"
}