import java.text.SimpleDateFormat
import java.util.ArrayList
import java.util.Calendar


val listHang = ArrayList<HangHoa>()
fun main() {
    val pnh = PhieuNhapHang()
    val ncc = NCC("NCC1", "LG-Electronic", "Khu cong nghiep Nhu Quynh A")
    val hangHoa = HangHoa()

    val h1 = HangHoa("Tivi",30.0, 2)
    val h2 = HangHoa("Quat",1.2, 3)
    val h3 = HangHoa("Mobi",5.0, 10)

    listHang.add(h1)
    listHang.add(h2)
    listHang.add(h3)

    pnh.createTT( "PH001")
    pnh.showTT()
    ncc.showNcc()
    hangHoa.bangHang()


}



