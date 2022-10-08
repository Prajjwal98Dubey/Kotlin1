class Execution3(sen:String){
     var arr=sen.split(" ")

     fun findLongestWord(){
         var count=0
         var word=""
         for(i in arr){
             if(i.length>count){
                 word=i
                 count=i.length
             }
         }
         println("The Longest Word in the Sentence is $word and it's length is $count")
     }

}
fun main(){
    val obj=Execution3("I Love Kotlin Language")
    with(obj){
        findLongestWord()
    }
}