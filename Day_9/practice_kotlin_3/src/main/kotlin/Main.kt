fun main(args: Array<String>) {
    val number: Int by lazy {
        println("초기화")
        7
    }

    println("코드를 시작합니다")

    println(number) //실행과 동시에 초기화 구문 실행
    println(number) //이미 초기화 완료 초기화 구문 실행 안함

}