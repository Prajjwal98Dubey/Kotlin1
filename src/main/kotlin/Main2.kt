
fun List<Int>.getProduct():Int{
    var prod=1
    for (l in this){
        prod=prod * l
    }
    return prod
}
fun main(){
   println(listOf(1,2,3,4,2,5).getProduct())
}