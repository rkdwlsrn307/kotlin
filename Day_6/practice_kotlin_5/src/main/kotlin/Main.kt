fun main(args: Array<String>) {
    Out.Nest().introduce()
    
    val outter = Out()
    val inner = outter.Inn()

    inner.introduceIn()
    inner.introduceOut()

    outter.test = "change outter class"
    inner.introduceOut()

}

class Out{
    var test = "Out"

    class Nest{
        fun introduce()
        {
            println("Nest")
        }
    }

    inner class Inn{
        var test = "In"

        fun introduceIn()
        {
            println(test)
        }

        fun introduceOut()
        {
            println(this@Out.test)
        }
    }
}