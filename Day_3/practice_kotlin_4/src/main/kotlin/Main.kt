fun main(args: Array<String>) {
    var a = Book("초보 코틀린", 20000).apply{
        name = "[초특가]" + name
        discount()
    }
    a.run{
        println("상품명 ${name}, 가격 ${price}원")
    }
}
class Book(var name: String, var price: Int)
{
    fun discount()
    {
        price -= 2000
    }
}