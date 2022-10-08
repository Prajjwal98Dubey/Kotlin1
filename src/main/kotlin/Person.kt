 open class Person(firstname:String,lastname:String) {
   open val fname=firstname
     open val lname=lastname
    fun getName(){
        println("hi my name is $fname $lname ")
    }
}