fun main(args: Array<String>) {
    sum(1,2,3,4,5,6,7,8,9,10)

    println(3 multiply 5)
}

fun sum(vararg numbers: Int)
{
    var sum = 0

    for(n in numbers)
    {
        sum += n
    }

    println(sum)
}

infix fun Int.multiply(x: Int): Int = this * x