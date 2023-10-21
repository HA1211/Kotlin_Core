class NVKK(
    var id: Int = 1,
    var tenNV: String = "",
    var chucVu: String = ""
) {
    fun nhapNV(tenNV: String, chucVu: String){
        this.tenNV = tenNV
        this.chucVu = chucVu
    }
    fun hienThi(){
        println(String.format("%30s %30s", "Nhan vien kiem ke: $tenNV", "Chuc vu: $chucVu"))
    }
}