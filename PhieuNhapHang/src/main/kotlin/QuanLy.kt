import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.SimpleTimeZone

val tv = Tivi("Tivi")
val quat = Quat("Quat")
val mobi = Mobi("Mobi")
val tt = ThongTin()
fun main() {
    tv.create(30.0, 2)
    quat.create(1.2, 3)
    mobi.create(5.0, 10)
    tt.create("PH001", "NCC1", "LG-Electronic","Khu cong nghiep Nhu Quynh A")

    val cal = Calendar.getInstance()
    val fm = SimpleDateFormat("dd/MM/yyyy")
    val date = fm.format(cal.time)


    println(String.format("%45s", "PHIEU NHAP HANG"))
    println(String.format("%30s %30s","Ma phieu: ${tt.maPhieu}", "Ngay lap: $date"))
    println(String.format("%27s %35s","Ma NCC: ${tt.maNCC}", "Ten NCC: ${tt.tenNCC}"))
    println(String.format("%51s","Dia chi: ${tt.diaChi}"))

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

