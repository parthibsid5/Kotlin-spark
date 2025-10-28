package `01_basics`

fun main() {
	val firstname ="Rahul"; //read only
    var val1:Boolean =true;
    var val2:Double=2.00025;
    var weight=52; // read write 
    weight=weight+3;
    
    println(firstname);
    println(weight);
    
    val mystr="Kotlin";
    println(mystr[0]);
    println(mystr.isEmpty());
    println(mystr.length);
    println(mystr.substring(mystr.length-3));
    println(mystr.substring(2,5));
    println("The string is $mystr");
    
    println(println("hi"));
    //by def list is immutable
    val names=listOf("alice","bob",12,1.02,'a');
    println(names);
//  names.add("hillery")  would give error
	
    val heros=mutableListOf("ironman", "saktiman","hulk","ultron","vison");
    println(heros);
    
//  iteration
    for(hero in heros){
        print(hero+" ");
    }
    println()
    //include last
    for(i in 1..6){
        print(i);
    }
    println()
   //won't include last
   for(i in 1 until 6){
       print(i);
   }




}