fun main(args: Array<String>) {
    val namelist = listOf("짜장면", "라면", "치킨", "떡볶이", "불닭볶음면")

    namelist.forEach{ print(it + " ")}
    println()

    println(namelist.filter{it.endsWith("면")})

    println(namelist.map{"이름 : " + it})

    println(namelist.any{ it == "라면"})
    println(namelist.all{it.length == 3})
    println(namelist.none{it.startsWith("족")})

    println(namelist.first{it.endsWith("면")})
    println(namelist.last{it.endsWith("면")})
    println(namelist.count{it.contains("볶")})
}