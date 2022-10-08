class Execute{
    fun List<Int>.getProduct():Int{
        var prod=1
        for(i in this)
        {
            prod=prod*i
        }
        return prod
    }
}

fun main(){
    val obj=Execute()
    with(obj) {
       println(listOf(1, 2, 4, 5).getProduct())
    }

}