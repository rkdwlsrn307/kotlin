fun main(args: Array<String>) {
    val test1 = "Test.Kotlin.String"
    println(test1.length)

    println(test1.toLowerCase())
    println(test1.toUpperCase())

    val test2 = test1.split(".")
    println(test2)

    println(test2.joinToString())
    println(test2.joinToString("-"))

    println(test1.substring(5..10))

    val nullstr: String? = null
    val emptystr = ""
    val blankstr = " "
    val nomalstr = "A"

    println(nullstr.isNullOrEmpty())
    println(emptystr.isNullOrEmpty())
    println(blankstr.isNullOrEmpty())
    println(nomalstr.isNullOrEmpty())

    println()
    //공백 문자에는 space, tab, line Feed, Carrige Return등 눈에 직접적으로 보이지 않는 문자들
    println(nullstr.isNullOrBlank())
    println(emptystr.isNullOrBlank())
    println(blankstr.isNullOrBlank())
    println(nomalstr.isNullOrBlank())

    println()

    var test3 = "kotlin.kt"
    var test4 = "java.java"

    println(test3.startsWith("java"))
    println(test4.startsWith("java"))

    println(test3.endsWith(".kt"))
    println(test4.endsWith(".kt"))

    println(test3.contains("lin"))
    println(test4.contains("lin"))

}