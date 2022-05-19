fun main(){

    print("Digite um numero: ")
    val numero1 = readln().toDouble()

    print("Digite um segundo numero: ")
    val numero2 = readln().toDouble()

    println("A divisão entre $numero1 e $numero2 é de: ${dividir(numero1,numero2)}")


}

fun dividir(n1: Double, n2: Double) : Double{

    return  n1 / n2

}