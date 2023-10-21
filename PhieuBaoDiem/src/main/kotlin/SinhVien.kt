class SinhVien(
    var maSV: String,
    var ten: String,
    var lop: String,
    var khoa: Int
) {
    fun showSV(){
        println(String.format("%20s %40s \n %10s %30s","Ma sinh vien: $maSV", "Ten sinh vien: $ten","Lop: $lop", "Khoa: $khoa"))
    }
}