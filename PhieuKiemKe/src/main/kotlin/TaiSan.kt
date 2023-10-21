class TaiSan(
    var tenTS: String = "",
    var soLuong: Int = 0,
    var tinhTrang: TinhTrang = TinhTrang.Tot
) {
    fun hienThi(){
        var count = 0
        var sl = 0
        println(String.format("%20s %20s %20s", "Ten tai san", "So luong", "Tinh trang"))
        listTs.forEach {
            println(String.format("%20s %20s %20s", it.tenTS, it.soLuong, it.tinhTrang))
            sl += it.soLuong
            count += 1
        }
        println(String.format("%20s %20s", "So tai san da kiem ke: $count", "Tong so luong: $sl"))
    }
}