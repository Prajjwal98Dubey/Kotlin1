// lambda function practise

//lambda function for addtion of two numbers
//var sum:(Int,Int)->Int={a,b->a+b}
//
//fun main(){
//  print("Enter a  First Number: ")
// var str= readLine()!!
//    var s1=str.toInt()
//    print("Enter a  Second Number: ")
//    var str1= readLine()!!
//    var s2=str1.toInt()
////    println(sum(s1,s2))
//    println("The Sum of $s1 and $s2 is ${sum(s1,s2)}")
//
//
//}
//--------------------------------------------
//lambda expression for cube of a number.
//var getCube:(Int)->Int={value->value*value*value}
//fun main(){
//    println(getCube(4))
//
//}
///_____________________________________________
//var getBool:(Int)->Boolean={
//    if(it==0) false else true
//}
//fun main(){
//    println(getBool(0))
//}
//var compareTwo:(a:Int,b:Int)->String={
//    if(a>b){
//        return "First is greater than second"
//    }
//}

//fun main(){
//    print("Enter Your Name: ")
//    var name= readLine()
//    print("My Name is $name")
//}

//var getCube:(Int)->Int={value->value*value*value}
//fun main(){
//    print("Enter a Number: ")
//    var str =readLine()!!
//    var c:Int=str.toInt()
//    print(getCube(c))
//}

//fun main(){
//    val name:String?=null
//    println(name?.length)
//    println(name?.length?:"Empty String")
//}
//fun main()
//{
//    lateinit var name:String
//    name="prajjwal"
//    println(name)
//}
fun main(){
    var list=listOf(1,3,4,5,4)
     list.forEach{
         l->println(l*l)
     }
}