

var diemTungMon = ArrayList<DiemModel>()

fun main() {

    var sv = SinhVien("SV001", "Nguyen Hai Ha", "CNTT1", 10)

    val mon1 = MonHoc("Co so du lieu", 4)
    val mon2 = MonHoc("Lap trinh HDT", 3)
    val mon3 = MonHoc("He dieu hanh", 5)


    diemTungMon.add(DiemModel(mon1, 8.0))
    diemTungMon.add(DiemModel(mon2, 7.0))
    diemTungMon.add(DiemModel(mon3, 9.0))

    println(String.format("%35s", "PHIEU BAO DIEM"))
    println(String.format("%15s %35s","Ma sinh vien: ${sv.maSV}", "Ten sinh vien: ${sv.ten}"))
    println(String.format("%10s %24s", "Lop: ${sv.lop}", "Khoa: ${sv.khoa}"))

    var bang = BangDiem(diemTungMon)
    bang.hienThi()

    println(String.format("%35s %10.2f", "Diem trung binh", diemTB()))
}

fun diemTB(): Double{
    var tong = 0.0
    var tongSoTrinh = 0
    var DiemTB: Double

    diemTungMon.forEach {
        tong += it.monHoc.soTrinh * it.diem
        tongSoTrinh += it.monHoc.soTrinh
    }
    DiemTB = tong / tongSoTrinh
    return DiemTB
}



