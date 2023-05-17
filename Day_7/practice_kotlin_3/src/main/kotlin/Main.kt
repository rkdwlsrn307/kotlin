fun main(args: Array<String>) {
    var color = Color.red
    println(color)

    color = Color.blue
    println(color.isRed())

    color = Color.green
    println(color.color)
}

enum class Color(val color : String){
    red("빨강"),
    blue("파랑"),
    green("초록");

    fun isRed() = this == Color.red
}