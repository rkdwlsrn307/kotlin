fun main(args: Array<String>) {
    data class Person(val name : String, val birthday : Int)

    val person = listOf(Person("나", 2001,),
        Person("누나", 2000),
        Person("아빠", 1969),
        Person("엄마", 1970))

    println(person.associateBy{it.birthday})
    println(person.groupBy{it.name})

    val (over1999, under1999) = person.partition{it.birthday > 1999}
    println(over1999)
    println(under1999)
}