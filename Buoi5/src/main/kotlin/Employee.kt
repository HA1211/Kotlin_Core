


abstract class Employee(
    var code: Int = -1,
    var surname: String = "",
    var name: String = "",
    var dateOfBirth: Date = Date(), //cap nhat sau
    var yearWorking: Int = 0
) {
    abstract fun input()

    abstract fun output()
}