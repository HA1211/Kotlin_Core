class BangDiem(
    var listDiem: ArrayList<DiemModel> = ArrayList<DiemModel>()
) {

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

    fun hienThi(){
        println(String.format("%15s %15s %15s", "Ten mon", "So trinh", "Diem"))

        listDiem.forEachIndexed{index, diemM ->
            println(String.format("%15s %15s %15s", diemM.monHoc.tenMon, diemM.monHoc.soTrinh, diemM.diem))
        }
        println(String.format("%15s %15s %15.2f", "","Diem trung binh", diemTB()))
    }
}