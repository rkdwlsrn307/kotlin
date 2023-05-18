fun main(args: Array<String>) {
    var food = Food()

    food.searchprice(Food.FOOD_CREAM_PASTA)
    food.searchprice(Food.FOOD_STEAK)
    food.searchprice(Food.FOOD_PIZZA)
}

class Food{
    fun searchprice(foodname : String)
    {
        var price = when(foodname)
        {
            FOOD_CREAM_PASTA -> 11000
            FOOD_STEAK -> 25000
            FOOD_PIZZA -> 18000
            else -> 0
        }

        println("${foodname}의 가격은 ${price}원 입니다")
    }
    companion object {
        const val FOOD_CREAM_PASTA = "크림파스타"
        const val FOOD_STEAK = "스테이크"
        const val FOOD_PIZZA = "피자"
    }
}