
var listSubject = listOf<Subject>(
    Subject(1, "Toán"),
    Subject(2, "Lý"),
    Subject(3, "Hóa")
)

var listTeacher = ArrayList<Teacher>()

fun main() {

    println("Danh sach toan bo giao vien: ")
    var tc1 = addTeacher(3)
    var tc2 = addTeacher(1)
    var tc3 = addTeacher(2)

//    var tc = Teacher()
//    tc.input()
//    if(tc.salary < 5000000){
//        println("Gv luong thap hon 5m la gv ${}")
//    }

}

fun addTeacher(codeSubject : Int){
    listSubject.forEach {it ->
        if(it.code == codeSubject){
            listTeacher.add(Teacher(it))
            return println("Giáo viên ${it.name}")
        }
    }
    println("Môn k có")
}
