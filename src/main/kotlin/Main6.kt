///////Scope Functions
////
//////apply
////class Company{
////    lateinit var Company_Name:String
////    lateinit var Founder_Name:String
////    lateinit var Objective:String
////}
////
////fun main(){
////    val me=Company().apply{
////        Company_Name="Atmosphere"
////        Founder_Name="Prajjwal Dubey"
////        Objective="Technology Advancement and Innovation"
////    }
////    println("Hi my name is ${me.Founder_Name},i m the founder of ${me.Company_Name} and this company deals with ${me.Objective}")
////}
//////---------------------------------------------------------------------------------------------
//////let:- it generally deals with the null pointer exception and safe null.
////fun main() {
////    var a: Int? = null
////    a?.let {
////        println("I will be printed when a is null")
////    }
////    a = 3
////    a?.let {
////        println("I will be printed when a is 3 or at any non-null values")
////    }
////}
////}---------------------------------------------------------
//////with function is generally used to call the properties of the member function.
////    class Company{
////    lateinit var Company_Name:String
////    lateinit var Founder_Name:String
////    lateinit var Objective:String
////}
////
////fun main(){
////    val me=Company().apply{
////        Company_Name="Atmosphere"
////        Founder_Name="Prajjwal Dubey"
////        Objective="Technology Advancement and Innovation"
////    }
////    with(me){
////        println("Hi my name is $Founder_Name,i m the founder of $Company_Name and this company deals with $Objective")
////    }
////    }
////run works as the combinatin of both let and with scope functions and the syntax of run is similar to let.
//
////class Company{
////    lateinit var name:String
////    lateinit var founder:String
////    lateinit var objectives:String
////
////}
////fun main(){
////    var my:Company?=null
////     my?.run{
////         println("This text is printed first!!!")
////     }
////
////    my=Company().apply {
////        name="Google"
////        founder="larry Page"
////        objectives="Search Engine"
////
////    }
////    my?.run{
////        println("i have been printed secondly and the name of the company is $name")
////    }
////}
///////also scope functions:
//fun main(){
//    var list= mutableListOf<Int>(1,2,4,5)
////    ///without 'also' scope functions
////    list.add(33)
////    list.remove(1)
////    println(list)
//    /// with the help of also
//    list.also{
//        it.add(33)
//        it.remove(2)
//    }
//  println(list)
//}
//
