fun main(args: Array<String>) {
    var samsung = Samsung()
    var apple = Apple()
    var buds = Buds()
    var airpod = Airpod()

    samsung.camera()
    apple.camera()
    buds.play()
    airpod.play()

}
open class Phone {
    open fun camera()
    {
        println("사진을 찍습니다.")
    }
}
abstract class Music {
    abstract fun play()
}

class Buds : Music()
{
    override fun play()
    {
        println("가성비 좋은 무선 이어폰")
    }
}

class Airpod : Music()
{
    override fun play()
    {
        println("감성 하나는 좋은 이어폰")
    }
}

class Samsung : Phone()
{
    override fun camera()
    {
        println("카메라 성능은 삼성이지")
    }
}

class Apple : Phone()
{
    override fun camera()
    {
        println("사진 감성은 애플이지")
    }
}