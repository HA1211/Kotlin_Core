class Teacher(

    var subject: Subject,
    var coefficientsSalary: Double ,
    var numberOfTeachingHours: Int ,
    var salary: Double

): Employee() {
    fun createInfo(code: Int, name: String, surname: String){
        super.code = code
        super.name = name
        super.surname = surname
    }

    fun tinhLuong(){
        salary = coefficientsSalary*1150000 + numberOfTeachingHours*60000
    }

    override fun input(){

    }

    override fun output() {

    }
}