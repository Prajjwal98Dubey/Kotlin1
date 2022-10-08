class Execute2{
    fun List<Double>.getAltSum():Double{
        var sum=this[0]
        var count=0
        for(l in subList(1,this.size))
        {
            if(count%2==0)
            {
                sum=sum+l
                count++
            }
            else
            {
                sum=sum-l
                count++
            }

        }
        return sum
    }
}
fun main(){
    val  obj=Execute2()
    with(obj){
        println(listOf(100.34,343.54,352.13,32.3,4.0).getAltSum())
    }

}