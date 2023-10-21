

class PhieuNhapHang(
    var id: Int = 1,
    var ten: String = "PHIEU NHAP HANG",
    var maPhieu: String = "",
    var ngayLap: Date = Date()
) {
    fun createTT(maPhieu: String){
        this.maPhieu = maPhieu
        this.ngayLap =  Util.getDate()
    }

    fun showTT(){
        println(String.format("%35s \n %15s %15s %15s", ten, "Ma phieu: $maPhieu", "","Ngay lap: ${ngayLap.showDate()}"))
    }

}