fun main(args: Array<String>) {
    read(5)
    read("안녕하세요")

    delivery("라면", 5, "회사")
    delivery("피자")
    delivery("치킨", 3)
    delivery("초밥", destination = "친구집")
}

fun read(a: Int)
{
    println("integer")
    println(a)
}

fun read(a: String)
{
    println("string")
    println(a)
}

fun delivery(name: String, count : Int = 1, destination: String = "집")
{
    println("${name}, ${count}개를 ${destination}에 배달 하였습니다.")
}