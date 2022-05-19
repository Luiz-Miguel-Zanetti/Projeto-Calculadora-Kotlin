import kotlin.math.pow

fun main (){

    println( "Digite a base: " )
    val base = readln().toDouble()

    println("Digite o expoente: ")
    val expoente = readln().toDouble()

    println( "A potência da base $base elevado ao expoente $expoente é igual a: ${potencia(base, expoente)}")




}


fun potencia( n1 : Double, n2: Double ): Double {

    return n1.pow(2)

}
