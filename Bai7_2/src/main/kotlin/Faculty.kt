class Faculty(
    var tenGV: String = "",
    var date: Date = Date(),
    var x: School = School()
) {
    fun giangVien(tenGV: String, school: School){
        this.tenGV = tenGV
        this.x = school
    }
    fun showGV(){
        println(String.format("%30s \n %30s","Giang vien day: $tenGV", "Truong: ${x.name}"))
    }
}