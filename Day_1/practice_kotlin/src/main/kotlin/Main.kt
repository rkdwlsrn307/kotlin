class Number {
    var total: Int = 0
    var a: Int = 0
    var b: Int = 0

    fun print(){
        print(this.a)
        print(" + " + this.b)
        println(" = " + this.total)
    }
}

fun main(args: Array<String>) {
    val number : Number
    number = Number()
    number.a = 30
    number.b = 50
    number.total = number.a + number.b
    number.print()

    val number2 : Number
    number2 = Number()
    number2.a = number.a * 2
    number2.b = number.b * 2
    number2.total = number2.a + number2.b
    number2.print()

    val number3 : Number
    number3 = Number()
    number3.a = number2.a * 2
    number3.b = number2.b * 2
    number3.total = number3.a + number3.b
    number3.print()
}

