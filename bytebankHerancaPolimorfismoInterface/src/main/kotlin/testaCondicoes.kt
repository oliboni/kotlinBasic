fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> {
            println("A conta está positiva!")
        }
        saldo == 0.0 -> println("A conta está zerada!")
        else -> println("A conta está negativa!")
    }
}