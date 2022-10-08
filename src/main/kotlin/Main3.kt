
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
        else if(count%2!=0)
        {
            sum=sum-l
            count++
        }
        else{
            println("")
        }
    }
    return sum
}

fun main(){
    println(listOf(100.3,2543.3,3433.34,4343.34).getAltSum())
}