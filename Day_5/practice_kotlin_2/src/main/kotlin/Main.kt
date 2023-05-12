fun main(args: Array<String>) {
    var a = Drink()
    a.drink()

    var b : Drink = Coffe()
    b.drink()

    if(b is Coffe)
    {
        b.wash()
    }

    var c = b as Coffe
    c.wash()

    b.wash() //b도 down-casting 되었다
}

open class Drink{
    var name = "음료"
    open fun drink(){
        println("${name}를 마십니다")
    }
}

class Coffe : Drink(){
    var type = "커피"

    override fun drink(){
        println("${name}중 ${type}을 마십니다")
    }

    fun wash(){
        println("${type}으로 설거지를 합시다")
    }
}