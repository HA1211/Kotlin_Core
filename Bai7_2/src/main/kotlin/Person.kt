
open class Person(
    var name: String = "",
    var birth : Date = Date(),
    var address: String = ""
){
    open fun person(): String{
        return String.format("%30s \n %30s", name, address)
    }
}