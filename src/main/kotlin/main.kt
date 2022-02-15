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


    var contaVinicius = Conta("Vinicius", 1225)
    contaVinicius.deposita(680.0)

    var contaDavi = Conta("Davi", 1224)

    println("Saldo Conta Vinicius = ${contaVinicius.getSaldo()}")
    println("Saldo Conta Vinicius = ${contaDavi.getSaldo()}")

    contaVinicius.sacar(750.0)
    println("Saldo da Conta Vinicius depois do saque é = ${contaVinicius.getSaldo()}")

    contaVinicius.transferir(contaDavi, 100.00)

    println("Saldo da conta do Vinicius = ${contaVinicius.getSaldo()}")
    println("Saldo da conta do Vinicius = ${contaDavi.getSaldo()}")

}

class Conta (titular: String, numero: Int){
    private var titular: String = titular
    private var numero: Int = numero
    private var saldo: Double = 0.0

/*    constructor(titular: String, numero: Int){
        this.titular = titular
        this.numero = numero
    }*/


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

    fun transferir(contaDestino: Conta, valor: Double): Boolean {
        if (valor > saldo) {
            println("Não é possível fazer o saque, saldo insuficiente")
            return false
        } else {
            saldo -= valor
            contaDestino.deposita(valor)
            return true
        }
    }

    fun getSaldo(): Double {
        return saldo
    }

    fun setTitular(nome: String) {
        this.titular = nome
    }

    fun getTitular(): String {
        return titular
    }

    fun setNumero(novoNumero: Int) {
        this.numero = novoNumero
    }

    fun getNumero(): Int {
        return numero
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


