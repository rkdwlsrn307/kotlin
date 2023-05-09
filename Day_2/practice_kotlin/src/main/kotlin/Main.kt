fun main(args: Array<String>) {
    var dog = Dog("별이", 3, "개")
    var cat = Cat("나비", 2, "고양이")

    dog.introduce()
    cat.introduce()

    dog.bark()
    cat.meow()
}

open class Animal (var name : String, var age : Int, var type : String)
{
    fun introduce()
    {
        println("저는 ${type} ${name}이고, ${age}살 입니다")
    }
}

class Dog (name:String, age:Int, type:String) : Animal(name, age, type)
{
    fun bark ()
    {
        println("별이가 멍멍 짓습니다.")
    }
}

class Cat (name:String, age:Int, type:String) : Animal(name, age, type)
{
    fun meow ()
    {
        println("나비가 냐옹냐옹 웁니다")
    }
}