fun main(args: Array<String>) {

    val person = Person("Hiep", 21)

    person?.let { item ->
        println(item.age)
        println(item.name)
    }

}