// apply and with
//
//class Person1{
//    lateinit var name:String
//    lateinit var occupation:String
//    lateinit var company:String
//}
//fun main()
//{
//    var p1=Person1().apply {
//        name="Sumit"
//        occupation="Creative Director"
//        company="Film Pvt Ltd"
//    }
//    with(p1){
//        println("My Name is $name and i work for $company as a $occupation")
//    }
//}
/// let
//fun main(){
//    var str:String?="summer"
//    //if str is not null then only the block of let will be executed otherwise there will be no output.
//    str?.let{
//        println("$str is not null")
//    }
//    str=null
//    str?.let{
//        println("i am null")
//    }
//}

///run scope function is the combination of both the let and the with scope function.
//class Cars{
//    lateinit var name:String
//    lateinit var model:String
//}
//fun main(){
//    var car=Cars().apply{
//        name="Audi"
//        model="R8"
//    }
//    car?.run{
//        println("i got the ${car.name} $model !!!")
//    }
//}
/// also is used for assigning the multiple properties at the same time.

//fun main(){
//    var list = mutableListOf<String>("cars","bikes","scooty")
//    list.also {
//        it.add("bicylce")
//        it.add("trains")
//        it.remove("bikes")
//        it.add("aeroplane")
//    }
//    println(list)
//    for(l in list){
//        println(l)
//    }
//}