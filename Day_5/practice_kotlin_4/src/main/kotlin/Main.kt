fun main(args: Array<String>) {
    var drink = listOf("콜라", "커피", "맥주", "사이다", "우유")

    var food = mutableListOf("라면", "삼겹살", "짜장면", "짬뽕", "만두", "치킨")

    for(i in drink)
    {
        print("${i} ")
    }

    println()

    for(j in food)
    {
        print("${j} ")
    }

    println()

    food.shuffle()

    for(j in food)
    {
        print("${j} ")
    }
}