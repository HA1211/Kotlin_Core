

var diemTungMon = ArrayList<DiemModel>()

fun main() {

    var sv = SinhVien("SV001", "Nguyen Hai Ha", "CNTT1", 10)

    var pbd = PhieuBaoDiem(1, "PHIEU BAO DIEM")

    val mon1 = MonHoc("Co so du lieu", 4)
    val mon2 = MonHoc("Lap trinh HDT", 3)
    val mon3 = MonHoc("He dieu hanh", 5)

    diemTungMon.add(DiemModel(mon1, 8.0))
    diemTungMon.add(DiemModel(mon2, 7.0))
    diemTungMon.add(DiemModel(mon3, 9.0))

    var bang = BangDiem(diemTungMon)

    println(String.format("%30s", pbd.name))
    sv.showSV()
    bang.hienThi()

}





