open class HangHoa(
    var donGia: Double  = 0.0,
    var soLuong: Int = 0
) {


    fun create(donGia: Double, soLuong: Int){
        this.donGia = donGia
        this.soLuong = soLuong
    }
    fun thanhToan(): Double {
        var thanhTien = donGia * soLuong
        return thanhTien
    }
}