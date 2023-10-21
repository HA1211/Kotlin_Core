class NCC(
    var maNCC: String = "",
    var tenNCC:String = "",
    var diaChi: String = "",
) {
    fun showNcc(){
        println(String.format("%15s %15s %15s \n %15s", "Ma NCC: $maNCC", "","Ten NCC: $tenNCC", "Dia chi: $diaChi"))
    }
}