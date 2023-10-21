

val listHang = ArrayList<HangHoa>()

fun main() {

    var pmh = PhieuMuaHang()
    pmh.nhapPhieu("PH01")

    val hangHoa = HangHoa()

    var h1 = HangHoa(1,"Tivi",30.0, 2)
    var h2 = HangHoa(2,"Quat",1.2,  3)
    var h3 = HangHoa(3,"Mobi",5.0, 10)

    listHang.add(h1)
    listHang.add(h2)
    listHang.add(h3)

    pmh.show1()
    hangHoa.hienThi()

}
