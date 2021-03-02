fun testaCopiaEReferencia() {

    val numeroX = 10
    var numeroY = numeroX

    numeroY++

    println("NumeroX $numeroX")
    println("NumeroY $numeroY")

    val contaJoao = ContaCorrente("João", 1001)
    var contaMaria = contaJoao
    contaMaria.titular = "Maria"

    println("Titular conta Joao: ${contaJoao.titular}")
    println("Titular conta Maria: ${contaMaria.titular}")

}