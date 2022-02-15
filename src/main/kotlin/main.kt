import java.awt.Container

fun main() {
    println("Hello Kotlin");

/*    val titular: String = "Vinicius"
    val conta: Int = 1234
    var saldo: Double = 0.0
    saldo -= 15.0
    val i = 0

    println("Titular = $titular")
    println("Conta = $conta")
    println("Saldo = $saldo")*/

    //testCondicoes(saldo)
    //testaLacos()


    var contaVinicius = Conta()
    contaVinicius.titular = "Vinicius"
    contaVinicius.deposita(680.0)

    println("Saldo Conta Vinicius = ${contaVinicius.saldo}")

    contaVinicius.sacar(50.0)
    println("Saldo depois do saque é = ${contaVinicius.saldo}")

}

class Conta {
    var titular: String = ""
    var numero: Int = 0
    var saldo: Double = 0.0


    fun deposita(valor: Double) {
        saldo += valor
    }

    fun sacar(valor: Double) {
        if (valor > saldo) {
            println("Não é possível fazer o saque, saldo insuficiente")
        } else {
            saldo -= valor
        }
    }
}

fun testCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("Conta positiva")
    } else if (saldo == 0.0) {
        println("conta zerada")
    } else {
        println("conta negativa")
    }

    when {
        saldo > 0.0 -> println("Conta positiva")
        saldo == 0.0 -> println("conta zerada")
        else -> println("conta negativa")

    }

}

fun testaLacos() {
//cria 5 contas
    for (i in 1..5) {
        println(i)
    }

//cria 5 contas na ordem decrescente
    for (i in 5 downTo 1) {
        println(i)
    }

//cria 3 contas de 2 em 2
    for (i in 1..5 step 2) {
        println(i)
    }
}


