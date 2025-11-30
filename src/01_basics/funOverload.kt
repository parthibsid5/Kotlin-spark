fun main(){
    cal(2,3)
    cal(2.8,3.02)
    //named arguments for better readability in case of large number of arguments
    cal(b=6,a=8)

    //variable as fuction
    val result: (Double, Double) -> Unit = ::cal
    result(89.89,10.11)


}
fun cal(a:Int, b:Int){
    println("Sum of ${a} and ${b}  is "+(a+b))
}

fun cal(a:Double, b:Double){
    println("Sum of ${a} and ${b}  is "+(a+b))
}
