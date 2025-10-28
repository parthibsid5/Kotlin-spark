package `01_basics`


/*
 Type inferencing in kotlin- `automatically` determine the type
Integer byte, short, Int, Long
Floating float, double
Boolean- True, false
Character- char String

VAL-  ONLY ONCE ASSIGN
VAR- MULTIPLE REASSIGN

 No auto-intialization of variables as in java class, such as 0 for int.
*/

val pi=3.1415926; // global variable
fun main(){
    var name="neon"
    name="clove" // can be updated/reassigned

    val top_agent="sage"
//    top_agent="jett" can't be updated/reassigned

    println(name)
    println(top_agent)

    //explicit declarations
    var roll: Int=88
    roll++;
//    roll=88.4  type error

    val place:String="Jaipur"
    var temp: Float=39.7f
    var isHuhmid: Boolean=true
    var code:Char='J'
    var message: String="Pink city"
    println("$place temperature is $temp")



}