fun main(args: Array<String>) {
    val a = mutableSetOf("라면", "치킨", "떡볶이", "족발")

    for(item in a)
    {
        println("${item}")
    }

    a.add("짜장면")
    println(a)

    a.remove("족발")
    println(a)

    println(a.contains("라면"))
}