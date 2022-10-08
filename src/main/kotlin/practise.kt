//fun main(){
//    var str:String?="Prajjwal"
//    println(str?.length)
//    str=null
//    println(str?.length)
////    str="Dubey"
////    println(str?.split(""))
//}

fun main(){
    var word:String?="Zebra"
    println(word?:"The word is null!!!")
    word=null
    println(word?:"The word is null!!!")
    word="Lion"
    println(word?.length?:"The word is null!!!")
   word=null
   println(word?.length?:"The word is null!!!")
}