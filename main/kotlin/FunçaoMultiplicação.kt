fun main(){

    print( "Digite um numero: " )
    val numero1 = readln().toDouble()

    print("Digite um segundo numero: ")
    val numero2 = readln().toDouble()

    println( "A multiplicação entre $numero1 com o $numero2 é de: ${multiplicar(numero1, numero2)}" )


}

fun multiplicar (n1 : Double, n2 : Double): Double{

    return n1 * n2

}