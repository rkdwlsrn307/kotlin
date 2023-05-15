fun main(args: Array<String>) {
    var a: String? = null

    println(a?.toUpperCase())

    println(a?:"default".toUpperCase())

    //println(a!!.toUpperCase())

    a?.run{//데이터가 null인지 확인하는 구문으로 주로 사용
        println(toUpperCase())
        println(toLowerCase())
    }


}