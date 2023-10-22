class Tivi(
    var kickThuoc : Float = 0f,
    var ngayNhap: Date = Date(),
) : Hang() {

    fun nhap(kickThuoc : Float, name : String = "",nsx : NSX = NSX(), donGia : Int = 0) {
        this.kickThuoc = kickThuoc
        this.ngayNhap = Util.getDateNow()
        this.name = name
        this.nSX = nsx
        this.donGia = donGia
    }

    fun show() {
        println(String.format("%30s \n %30s \n %30s \n %30s \n %30s", "Ten TV: $name", "Kich thuoc: $kickThuoc", "Ngay nhap: ${ngayNhap.showDate()}", "Nha san xuat: ${nSX.tenNSX}", "Don gia: $donGia"))
    }
}