import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.SimpleTimeZone

val tv = Tivi("Tivi")

val quat = Quat("Quat")

val mobi = Mobi("Mobi")


fun main() {

    val cal = Calendar.getInstance()
    val dateFm = SimpleDateFormat("dd/MM/yyyy")
    val fmDate = dateFm.format(cal.time)


    tv.create(30.0, 2)
    quat.create(1.2, 3)
    mobi.create(5.0, 10)
    println(String.format("%45s", "PHIEU MUA HANG"))

    println(String.format("%25s %30s", "Ma phieu: PH01", "Ngay lap: $fmDate"))


    println(String.format("%15s %15s %15s %15s", "Ten hang", "Don gia", "So luong", "Thanh tien"))
    println(String.format("%15s %15s %15s %15s",tv.name , tv.donGia, tv.soLuong, tv.thanhToan()))
    println(String.format("%15s %15s %15s %15.1f",quat.name , quat.donGia, quat.soLuong, quat.thanhToan()))
    println(String.format("%15s %15s %15s %15s",mobi.name , mobi.donGia, mobi.soLuong, mobi.thanhToan()))
    println(String.format("%52s %10s", "Cong thanh tien", tong()))
}



fun tong(): Double{
    var tong = tv.thanhToan() + quat.thanhToan() + mobi.thanhToan()
    return tong
}