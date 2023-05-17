fun main(args: Array<String>) {
    val a = mutableMapOf("소녀시대" to "윤아",
        "원더걸스" to "선미",
        "빅뱅" to "태양",
        "샤이니" to "키")

    for(entry in a)
    {
        println("${entry.key} : ${entry.value}")
    }

    a.put("방탄소년단", "뷔")
    println(a)

    a.remove("원더걸스")
    println(a)

    println(a["방탄소년단"])
}