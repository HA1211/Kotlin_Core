class HangHoa(
    var id: Int = 0,
    var name: String = "",
    var donGia: Double  = 0.0,
    var soLuong: Int = 0
) {

    fun hienThi(){
        println(String.format("%15s %15s %15s %15s", "Ten hang", "Don gia", "So luong", "Thanh tien"))
            var tong = 0.0
            listHang.forEach {
                println(String.format("%15s %15s %15s %15.1f", it.name, it.donGia, it.soLuong, it.thanhTien()))
                tong += it.thanhTien()
            }

        println(String.format("%15s %15s %15s %15s","","","Cong thanh tien", tong))

    }


    fun thanhTien(): Double {
        var thanhTien = donGia * soLuong
        return thanhTien
    }
}