 class ccar(override var brand: String, override var model: String, override var year: Int) :icar{
    fun getDetails(){
        println("My car is $brand it's model is $model and it was released in the year $year")
    }
}
