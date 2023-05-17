fun main(args: Array<String>) {
    val a = Gen("진구", 123)
    println(a == Gen("진구", 123))
    println(a.hashCode())
    println(a)

    val b = Data("친구", 456)
    println(b == Data("친구", 456))
    println(b.hashCode())
    println(b)

    println(b.copy())
    println(b.copy("미경"))
    println(b.copy(id = 789))
}

class Gen (val name : String, val id : Int)

data class Data (val name : String, val id : Int)