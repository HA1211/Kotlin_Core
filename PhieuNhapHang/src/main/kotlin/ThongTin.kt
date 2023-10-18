class ThongTin(
    var maPhieu: String = "",
    var maNCC: String = "",
    var tenNCC:String = "",
    var diaChi: String = ""
) {
    fun create(maPhieu: String, maNCC: String, tenNCC:String, diaChi: String){
        this.maPhieu = maPhieu
        this.maNCC = maNCC
        this.tenNCC = tenNCC
        this.diaChi = diaChi
    }
}