fun main(args: Array<String>) {

    var contPar=0
    var contImpar=0
    var cont = 1

    while(cont <= 10){
        print("Informe um numero: ")
        var numero = readLine()!!.toInt()

        cont += 1

        if(numero%2==0){
            numero = contPar
            contPar++
        }else {
            numero = contImpar
            contImpar++
        }
    }
    println("A quantidade de numeros pares digitados foram: $contPar, e os impares foram: $contImpar")
}