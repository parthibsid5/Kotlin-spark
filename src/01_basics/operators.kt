package `01_basics`

fun main(){
    var a= 19;
    var b= 5;
    println(a+b)
    println(a-b)
    println(a*b)
    println(a.toFloat()/b)
    println(a%b)
    val age:Int =18;
    vote(age)
    unaryOperators()
    rangeOperators()
    typeAndElvisOperator()
    logicalOperator()
}
fun vote(a:Int){
    if(a>=18) println("user can vote")

    else println("user cannot vote")
}
fun unaryOperators(){
    var i=1
    var j=2;
    i=++j+ --j + ++j + j + j + j-- + i-- + i;
    println(i)
}
fun rangeOperators(){
//    ..  downTo  step  until
    for(i in 1..5){
        println("2 * $i ="+2*i)
    }

    for(i in 10 downTo 1 step 3){
        println(i)
    }

    for(i in 10 until 21 step 3){
        println(i)
    }
}
fun typeAndElvisOperator(){
//    is and !is are typechecking operators
    var x:Int=56
    println(x is Int)

//    Elvis Operator (?:)
//    provides a default vlue if null

    var value=null
    var age =value?:19
    println(age)
}

fun logicalOperator(){
    //short circuiting
    var i=5
    var j=10
    if(i==5 || ++j==11){
        println(i)
        println(j)
    }

    if(++i==6 && j==10){
        println(i)
        println(j)
    }
}
