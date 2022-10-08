class A{
    var foo=5
}
fun main(){
    var a=A()
    var b=A()

    if(a==b) println(true) else println(false)
    if(a===b) println(true) else println(false)

    a==b
    if(a==b) println(true) else println(false)
    if(a===b) println(true) else println(false)

}