class Ban(
    var maBan: String = "",
    var tenBan: String = "",
    var ngayThanhLap: Date = Date()
) {
    fun hienThiBan(){
        println(String.format("%30s %30s %30s", "Ma ban: $maBan", "Ten ban: $tenBan", "Ngay thanh lap: ${ngayThanhLap.showDate()}"))
    }
}