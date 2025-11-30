package `01_basics`

fun main(){
    //chack even odd
    var num:Int=5;
    var result= if(num%2==0) "Even" else "Odd"
    println(result)

    val avenger="Ironman"
// switch case in java <==> WHEN in kotlin
    when(avenger){
        "Spiderman"->println("Hi Peter..")
        "Captain America"-> println("Hi Rogers.")
        "Ironman" -> println("Hello Tony..")
        else->println("Not a hero...!")
    }
    display(3)
    //default arguemnt 2 will be taken as input
    display()

}
    // default arguments in methods
    fun display(counter:Int=2){
        for(i in 1..counter){
            println("Hello counter: $counter")
        }
    }