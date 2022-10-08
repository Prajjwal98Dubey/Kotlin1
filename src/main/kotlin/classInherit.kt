open class classInherit {
   open  fun getPrint(){
        println("i have been printing from the first class")
    }
}
class classInherit2:classInherit(){
    override fun getPrint(){
        super.getPrint()
        println("i have been printing from the second class which is inheriting the propeties of the first clas")
    }
}