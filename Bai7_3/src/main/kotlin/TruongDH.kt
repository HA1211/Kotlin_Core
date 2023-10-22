class TruongDH(
    var listKhoa: ArrayList<Khoa>,
    var listBan: ArrayList<Ban>,
): Truong() {

    fun nhap(maTruong: String, tenTruong: String, diaChi:String){
        super.maTruong = maTruong
        super.tenTruong = tenTruong
        super.diaChi = diaChi
    }

    fun xuat(){
        println(String.format("%30s \n %30s \n %30s", "Ma truong: $maTruong", "Ten truong: $tenTruong", "Dia chi: $diaChi"))
        println(String.format("%30s", "Danh sach khoa: "))
        for (khoa in listKhoa){
            khoa.hienThiKhoa()
        }

        println(String.format("%30s", "Danh sach ban: "))
        for (ban in listBan){
            ban.hienThiBan()
        }
    }
}