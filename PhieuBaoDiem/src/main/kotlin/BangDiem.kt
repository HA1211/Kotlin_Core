class BangDiem(
    var listDiem: ArrayList<DiemModel> = ArrayList<DiemModel>()
) {

    fun hienThi(){
        println(String.format("%15s %15s %15s", "Ten mon", "So trinh", "Diem"))

        listDiem.forEachIndexed{index, diemM ->
            println(String.format("%15s %12s %17s", diemM.monHoc.tenMon, diemM.monHoc.soTrinh, diemM.diem))
        }
    }
}