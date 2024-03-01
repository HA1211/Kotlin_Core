
var listSubject = listOf<Subject>(
    Subject(1, "Toán"),
    Subject(2, "Lý"),
    Subject(3, "Hóa"),
    Subject(4, "Anh")
)

var listTeacher = ArrayList<Teacher>()

fun main() {

    addTeacher(4, 1, "Hiep", "Nguyen")
    addTeacher(3, 2, "Huy", "Pham")
    addTeacher(1, 3, "Quy", "Nguyen")
    addTeacher(2, 4, "Linh", "Hoang")
    addTeacher(3, 5, "Ha", "Dang")

    showAllDS()

    println("-------------------------------------------------------------------------------------")

    showGvLuongThap(5000000)

    println("-------------------------------------------------------------------------------------")

    println(tongluong())

}

fun showAllDS(){
    listTeacher.forEach {item ->
        println(String.format("%10s %10s %10s %10s", item.code, item.surname, item.name, item.subject.name))
    }
}

fun showGvLuongThap(luong: Int){

    println("Danh sách giáo viên lương thấp hơn $luong là:")
    listTeacher.forEach {
        if(it.salary < luong){
            println(String.format("%10s %10s %10s %10s %15s", it.code, it.surname, it.name, it.subject.name, it.salary))
        }
    }
}

fun getNameSubject(id : Int) :String{
    listSubject.forEach {
        if(it.code == id){
            return it.name
        }
    }
    return ""
}

fun tongluong(): Double {
    var sum : Double = 0.0
    listTeacher.forEach {
        sum += (it.salary).toInt()
    }
    return sum
}

fun addTeacher(codeSubject : Int, code: Int, name: String, surname: String){
    listSubject.forEach{
        if(it.code == codeSubject){
            val tc = Teacher(it, 1.0, 1, 1.0)
            tc.createInfo(code, name, surname)
            tc.tinhLuong()
            listTeacher.add(tc)
            return
        }
    }
    println("Môn k có")
}
