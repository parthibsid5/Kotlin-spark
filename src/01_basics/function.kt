package `01_basics`


fun main(args: Array<String>){
    println("Welcome to league of kotlin")
    println(1+2)
    println(false)
    println(add(7,5))
    multiply(4,7)

    details("Neo",81995)
}
fun add(a: Int, b:Int): Int{
    return a+b;
}

fun multiply(a:Int,b:Int)=println(a*b)


// Unit is analogous  to void in java but unit is a `real class (singleton
// object)` unlike void a keyword
// Default type is unit and it can be omitted also

fun details(name:String, roll: Int): Unit{
    println("Name is $name, roll is $roll")
}