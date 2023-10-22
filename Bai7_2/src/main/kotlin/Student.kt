class Student(
    var y: Faculty = Faculty("Nguyen Van A"),
    var lop: String = "",
    var score: Double = 0.0
):Person() {
    fun student(name: String, address: String,ngaySinh : Date,lop: String, score: Double){
        super.name = name
        super.address = address
        super.birth = ngaySinh
        this.lop = lop
        this.score = score
    }

    fun showSV(){
        println(String.format("%30s \n %30s \n %30s \n %30s \n %30s" , "Ho ten: $name","Lop: $lop","Ngay sinh: ${birth.showDate()}" ,"Diem: $score", "Dia chi: $address"))
    }
}