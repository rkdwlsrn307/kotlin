fun main(args: Array<String>) {
    println(Cnt.cnt)

    Cnt.cntUp()
    Cnt.cntUp()
    Cnt.cntUp()
    Cnt.cntUp()

    println(Cnt.cnt)

    Cnt.cntClear()

    println(Cnt.cnt)
}

object Cnt {
    var cnt = 0

    fun cntUp()
    {
        cnt++
    }
    fun cntClear()
    {
        cnt = 0
    }
}