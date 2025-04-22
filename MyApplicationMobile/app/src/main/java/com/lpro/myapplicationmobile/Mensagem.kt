package com.lpro.myapplicationmobile

class Mensagem {

    fun enviar () {
        val user = Usuario()
        user.logar()
    }

    fun saudacao (nome: String): String {
        return "Opaa, $nome"
    }

    fun main() {
        val user = Usuario("lucasptrick")
        val msg = saudacao(user.username)
        println(msg)
        println("--------------")
        println("Usando Filter")
        val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
        val pares = numbers.filter { it % 2 == 0 }
        println("Exibindo os números pares da lista de numbers: $pares")
        val textInvertido = msg.reversed()
        println("Texto Invertido: $textInvertido")
    }
}