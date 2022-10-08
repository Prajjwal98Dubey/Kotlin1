import java.util.*

/////Elvis operator generally works as a ternary operator.
//const val c=5
//fun main(){
//    println(c)
//    var a:Int?=null
//    var str:String?="null"
//    println(a?:"It is null!!!")
//    a=4
//    println(a?:"It is null!!!")
//    println(str?:"It is null!!!")
//}
///Safe Calls(?.) is the same as the if-else statements for checking the nullability of a variable.
fun main(){
    var str1:String?="Prajjwal"
    var str2:String?=null

    println(str1?.length)
    println(str2?.length)
    str2="Dubey"
    println(str2?.length)
    println(str2?.uppercase(Locale.getDefault()))



}