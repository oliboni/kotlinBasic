package testes

fun testeSet() {
    //    val assistiramCursoAndroid = listOf("Rodrigo", "Kachi", "Joao", "Maria")
//    val assistiramCursoAndroid = setOf("Rodrigo", "Kachi", "Joao", "Maria")
//    val assistiramCursoKotlin = listOf("Rodrigo","Marcio", "Gean", "Fabiana", "Luci")

//    val assistiramAmbos = mutableListOf<String>()
//    assistiramAmbos.addAll(assistiramCursoAndroid)
//    assistiramAmbos.addAll(assistiramCursoKotlin)
//    println(assistiramAmbos)
    /**
     * Pode ser feito a mesma coisa da seguinte forma:
     * */
//    val assistiramAmbos = assistiramCursoAndroid + assistiramCursoKotlin
//    println(assistiramAmbos)
//    println(assistiramAmbos.distinct())
    /**
     * Pode ser feito a mesma coisa usando o set(conjunto) forma:
     *  - Sendo que o primeiro elemento antes da junção (+) definirá o tipo de elemento retornado
     * */
//    val assistiramAmbos = assistiramCursoAndroid + assistiramCursoKotlin
//    println(assistiramAmbos)

    val assistiramCursoAndroid = mutableSetOf("Rodrigo", "Kachi", "Joao", "Maria")
    val assistiramCursoKotlin = mutableSetOf("Rodrigo", "Marcio", "Gean", "Fabiana", "Luci")
//    val assistiramAmbos = assistiramCursoAndroid + assistiramCursoKotlin
    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Luci")
    assistiramAmbos.add("Felipe")
    println(assistiramAmbos)

    println(assistiramCursoAndroid + assistiramCursoKotlin)
    println(assistiramCursoAndroid.union(assistiramCursoKotlin))
//    Devido o union ser um "infix", também pode ser usado sem o ponto
    println(assistiramCursoAndroid union (assistiramCursoKotlin))

    println(assistiramCursoAndroid - assistiramCursoKotlin)
    println(assistiramCursoAndroid subtract (assistiramCursoKotlin))
    println(assistiramCursoKotlin subtract (assistiramCursoAndroid))

    println(assistiramCursoKotlin intersect (assistiramCursoAndroid))

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Rodrigo")
    println(assistiramList)
    println(assistiramList.toSet())
}

