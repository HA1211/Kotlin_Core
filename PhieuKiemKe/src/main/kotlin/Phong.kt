class Phong(
    var tenPhong: String = "",
    var maPhong: String = "",
    var idTruongP: Int = 1,
    var truongPhong: String = ""
) {
    fun nhapPhong(tenPhong: String, maPhong: String, truongPhong: String){
        this.tenPhong = tenPhong
        this.maPhong = maPhong
        this.truongPhong = truongPhong
    }
    fun hienThi(){
        println(String.format("%20s %20s \n %20s", "Kiem ke tai phong: $tenPhong", "Ma phong: $maPhong", "Truong phong: $truongPhong"))
    }
}