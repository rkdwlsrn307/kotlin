fun main(args: Array<String>) {
    val list = listOf(Data("진구", 123), Data("친구", 456), Data("미경", 789))

    for((a,b) in list)
    {
        println("${a}, ${b}")
    }
}

class Gen (val name : String, val id : Int)

data class Data (val name : String, val id : Int)