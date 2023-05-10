fun main(args: Array<String>) {
    b(::a)
    //val c : (String) -> Unit = {str -> println("$str 람다함수")}
    // 앞에 (Stiring)이 선언되어 있어 자동 추론 됨 {str:String}
    val c = {str : String -> println("$str 람다함수")}
    b(c)
}

fun a (str: String){
    println("$str 함수 a")
}

fun b (function : (String) -> Unit){
    function("b가 호출한")
}