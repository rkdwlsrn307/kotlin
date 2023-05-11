fun main(args: Array<String>) {
    var a = FoodPoll("짜장")
    var b = FoodPoll("짬뽕")

    a.vote()
    a.vote()
    a.vote()

    b.vote()
    b.vote()
    b.vote()
    b.vote()
    b.vote()
    b.vote()

    println("${a.name} : ${a.cnt}")
    println("${b.name} : ${b.cnt}")
    println("총계 : ${FoodPoll.total}")
}

class FoodPoll (val name: String) {
    companion object {
        var total = 0
    }
    var cnt = 0

    fun vote(){
        total++
        cnt++
    }
}