abstract class Employee(
    var code: Int = -1,
    var surname: String = "",
    var name: String = "",
    var dateOfBirth: Date = Date(),
    var yearWorking: Int = -1
) {
    abstract fun input()
    abstract fun output()
}