//Função principal
fun main(args: Array<String>){

    calculadora()

}

//Definição das funções que a calculadora irá resolver
fun soma(num1: Float, num2: Float) = num1.plus(num2)
fun subtracao(num1: Float, num2: Float) = num1.minus(num2)
fun multiplicacao(num1: Float, num2: Float) = num1.times(num2)
fun divisao(num1: Float, num2: Float) = num1.div(num2)
fun porcentagem(num1: Float, num2: Float) = num1.times(num2) / 100


//Iniciando a calculadora
fun calculadora () {

    println("Bem-vinde à calculadora! Por gentileza, digite o número correspondente à operação que deseja realizar: ")
    println("1. Soma")
    println("2. Subtração")
    println("3. Multiplicação")
    println("4. Divisão")
    println("5. Porcentagem")

    println("Digite a operação escolhida e aperte enter: ")
    val operador: Int = readLine()!!.toInt()

    println("Digite o primeiro número que quer calcular e aperte enter: ")
    val num1: Float = readLine()!!.toFloat()

    println("Digite o segundo número que quer calcular e aperte enter: ")
    val num2: Float = readLine()!!.toFloat()

    when (operador) {
        1 -> {
            println("O resultado da operação é " + soma(num1, num2))
        }
        2 -> {
            println("O resultado da operação é " + subtracao(num1, num2))
        }
        3 -> {
            println("O resultado da operação é " + multiplicacao(num1, num2))
        }
        4 -> {
            println("O resultado da operação é " + divisao(num1, num2))
        }
        5 -> {
            println("O resultado da operação é " + porcentagem(num1, num2))
        }
        else -> println("Por favor, escolha um dos números informados")
    }
    repeticao()
}

//Função para realizar um novo cálculo utilizando a função de repetição, que é chamada logo após o resultado da operação
fun repeticao() {
    println("Digite 1 para realizar uma nova operação")
    val decidir: Int = readLine()!!.toInt()

    if (decidir === 1){
        calculadora()
    } else {
        println("Obrigade! :D")
    }
}