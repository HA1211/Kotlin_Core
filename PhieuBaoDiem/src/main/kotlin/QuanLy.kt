

var diemTungMon = ArrayList<DiemModel>()

fun main() {

    val sv = SinhVien("SV001", "Nguyen Hai Ha", "CNTT1", 10)
    val pbd = PhieuBaoDiem()


    val mon1 = MonHoc(1,"Co so du lieu", 4)
    val mon2 = MonHoc(2,"Lap trinh HDT", 3)
    val mon3 = MonHoc(3,"He dieu hanh" , 5)

    diemTungMon.add(DiemModel(mon1, 8.0))
    diemTungMon.add(DiemModel(mon2, 7.0))
    diemTungMon.add(DiemModel(mon3, 9.0))


    val bang = BangDiem(diemTungMon)


    println(String.format("%40s", pbd.name))
    sv.showSV()
    bang.hienThi()

}





