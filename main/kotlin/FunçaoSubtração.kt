fun main(){

    print("Digite um numero: ")
    val numero1 = readln().toDouble()

    print("Digite um segundo numero: ")
    val numero2 = readln().toDouble()

    println( "A subtração do $numero1 - o $numero2 é de: ${subtrair(numero1, numero2)}" )



}

fun subtrair( n1: Double, n2: Double ) : Double {

    return n1 - n2


}