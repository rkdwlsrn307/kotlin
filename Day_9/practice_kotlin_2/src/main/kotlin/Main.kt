fun main(args: Array<String>) {
    val a = Late()

    println(a.getlateinit())
    a.text = "새로 할당한 값"

    println(a.getlateinit())
}

class Late{
    lateinit var text : String

    fun getlateinit() : String {
        if(::text.isInitialized)
        {
            return text
        }
        else
        {
            return "기본값"
        }
    }
}