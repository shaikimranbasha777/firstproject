//looping statements
fun add(){
    //println("Frist Project Using Kotlin")
    //step means it will skip revry second value like 13579
    /*for (x in 1..10 step 2){
        println(x)
    }*/
    // downTo key word is reversely printing x values
    /*for (x in 10 downTo 1 step 2){
        println(x)
    }*/
    /*var data = arrayOf(1,2,3,4,5,6,7)
    for (x in data.indices){
        println(x)
    }*/
    //lableing for loop will break outer loop also
    loop1@ for (x in 1..5){
        for (i in 1..5){
            println("x value $x and i value $i")
            if (i == 2){
                break@loop1
            }
        }
    }
}

//functions 
fun sum():Unit{
    // Unit is same as void in java returning null
    println(1+2+3)
}

//lambda function
var myFunction : (Int,Int) -> Unit={i:Int,j:Int -> println(i+j)}
var myFunctionc : (Int) -> Unit={i:Int -> println(i)}

//Arrays
var myArray = Array<Int>(10){0};
var myArray2 = arrayOf(2,5,7,4,6,8)
var floatArray = floatArrayOf(1f,5f,8f)
var chars = charArrayOf("s","s","f","g","r")



fun main(){
    //var name:String = "imran"
    //println("Enter age")S
    //var age:Int = Integer.valueOf(readLine());
    //var num:Double = 25.25
    //var age2:Long = age.toLong();
    println("Hello world!")
    //println("My name is $name and age is $age2 my number is $num")
    //add()
    //println(sum()) when u your returning value
    //sum();
    //myFunction(10,20)
    //myFunctionc(10)
    /*for (ele in myArray2){
        println(ele)
    }*/
    println(myArray2.size)
    myArray.set(0,10);


}