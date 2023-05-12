fun main(args: Array<String>) {
    UseGenric(A()).doshout()
    UseGenric(B()).doshout()
    UseGenric(C()).doshout()

    doshout(C())
}

fun <T:A>doshout(t:T){
    t.shout()
}

open class A{
    open fun shout(){
        println("A가 소리칩니다")
    }
}

class B : A(){
    override fun shout(){
        println("B가 소리칩니다")
    }
}

class C : A(){
    override fun shout(){
        println("C가 소리칩니다")
    }
}

class UseGenric<T:A>(val t:T){
    fun doshout(){
        t.shout()
    }
}