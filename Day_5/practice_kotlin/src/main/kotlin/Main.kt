fun main(args: Array<String>) {
    Eprinter().start() //start 함수 호출
}

interface Elistener {
    fun onEvent(count : Int) //이벤트 발생시 숫자 반환
}
class Counter(var listener: Elistener) //이벤트를 발생시키기 위해 생성자로 Elistener를 속성으로 받는다
{
    fun count(){ // 함수가 호출되면 1에서 100까지 5의 배수를 호출
        for (i in 1..100){
            if (i % 5 == 0) {
                listener.onEvent(i)
            }
        }
    }
}
class Eprinter{
    fun start(){
        val counter = Counter(object: Elistener{
            override fun onEvent(count: Int){
                print("${count} ")
            }
        })
    }
}
/*
class Eprinter: Elistener{
    override fun onEvent(count: Int){
        print("${count} ")
    }
    fun start(){
        val counter = Counter(this)
        counter.count()
    }
}*/
