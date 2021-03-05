package testes

import java.math.BigDecimal
import java.math.RoundingMode

fun testaAumento() {
    val salarios = doubleArrayOf(1500.50, 2300.0, 5000.0, 13250.98)

    for (indice in salarios.indices) {
        salarios[indice] = aumento(salarios[indice], 0.1)
    }

    println(salarios.contentToString())
    salarios.forEachIndexed { i, salario ->
        salarios[i] = aumento(salario, 0.1)
    }
    println(salarios.contentToString())


    val salarioss = Array<BigDecimal>(5) { BigDecimal.ZERO }
    salarioss[0] = "1500.55".toBigDecimal()
    salarioss[1] = "15000.98".toBigDecimal()
    salarioss[2] = "1805.32".toBigDecimal()
    salarioss[3] = "4581.75".toBigDecimal()
    salarioss[4] = "7105.26".toBigDecimal()
    println(salarioss.contentToString())

    val arraySalario = bigDecimalArrayOf("1500.55", "15000.98", "1805.32", "4581.75", "7105.26")
    println(arraySalario.contentToString())

    val salarioComAumento = arraySalario
        .map { salario -> calculaAumentoRelativo(salario) }
        .toTypedArray()

    println(salarioComAumento.contentToString())

    val gastoInicial = salarioComAumento.somatoria()
    println("Gasto inicial $gastoInicial")

    val meses = "6".toBigDecimal()
    val gastoTotal = salarioComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }

    println("Gasto total $gastoTotal")

//    val salarioOrdenados = salarioComAumento.sorted()
//    val tresUltimosSalarios = salarioOrdenados.takeLast(3).toTypedArray()
//
//    val media = tresUltimosSalarios.media()
//    println("Media 3 maiores salários: $media")

    val media = salarioComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()
    println("Meida 3 maiores salários $media")
    println("Meida 3 menores salários ${salarioComAumento.sorted().take(3).toTypedArray().media()}")


}

private fun calculaAumentoRelativo(salario: BigDecimal) = if (salario < "5000".toBigDecimal()) {
    salario + "500".toBigDecimal()
} else {
    (salario * "1.1".toBigDecimal()).setScale(2, RoundingMode.UP)
}

fun aumento(valor: Double, porcentagemAumento: Double): Double {
    val aumento = valor * porcentagemAumento

    if (aumento < 500) {
        return valor + 500.0
    }

    return valor + aumento
}

