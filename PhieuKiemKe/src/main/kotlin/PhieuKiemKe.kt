class PhieuKiemKe(
    var id: Int = 1,
    var tenPhieu: String = "PHIEU KIEM KE TAI SAN",
    var maPhieu: String = "",
    var ngayKiem: Date = Date()
) {
    fun nhapPhieu(maPhieu: String){
        this.maPhieu = maPhieu
        this.ngayKiem = Unit.getDate()
    }
    fun hienThi(){
        println(String.format("%40s \n %10s %50s", tenPhieu, "Ma phieu: $maPhieu", "Ngay kiem ke: ${ngayKiem.showDate()}"))
    }
}