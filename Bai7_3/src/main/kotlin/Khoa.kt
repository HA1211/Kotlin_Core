class Khoa(
    var maKhoa:String = "",
    var tenKhoa:String = "",
    var truongKhoa:String = ""
) {
    fun hienThiKhoa(){
        println(String.format("%30s %30s %30s", "Ma khoa: $maKhoa", "Ten khoa: $tenKhoa", "Truong khoa: $truongKhoa"))
    }
}