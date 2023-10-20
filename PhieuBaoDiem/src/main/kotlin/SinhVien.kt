class SinhVien(
    var maSV: String,
    var ten: String,
    var lop: String,
    var khoa: Int
) {
    fun showSV(){
        println(String.format("%25s %35s","Ma sinh vien: $maSV", "Ten sinh vien: $ten"))
        println(String.format("%25s %35s","Lop: $lop", "Khoa: $khoa"))
    }
}