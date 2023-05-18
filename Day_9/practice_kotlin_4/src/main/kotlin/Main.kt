fun main(args: Array<String>) {
    var bitD : Int = 0b10000

    bitD = bitD or (1 shl 2)
    println(bitD.toString(2))
    var result = bitD and (1 shl 4)
    println(result.toString(2))
    println(result shr 4)

    bitD = bitD and ((1 shl 4).inv())
    println(bitD.toString(2))

    println((bitD xor (0b10100)).toString(2))
}