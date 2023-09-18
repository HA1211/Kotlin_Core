class Teacher(
    var subject: Subject = Subject(),
    var coefficientsSalary: Double = 0.0,
    var numberOfTeachingHours: Int = 0,
    var salary: Double = 0.0
): Employee() {
    override fun input(){
        println("Nhap he so luong: ")
        var s: String?= readln()
        println("Nhap so gio day: ")
        var s1: String ?= readln()
        if(s != null && s1 != null){
            coefficientsSalary = s.toDouble()
            numberOfTeachingHours = s1.toInt()
            calcuSalary()
        }
    }

    override fun output() {
        if(salary < 5000000){
            println()
        }
    }
    fun calcuSalary(){
        salary = coefficientsSalary * 1150000 + numberOfTeachingHours * 60000
    }
}