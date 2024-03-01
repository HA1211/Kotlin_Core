class Tivi(
        var kickThuoc : Float = 0f,
        var ngayNhap: Date = Date(),
) : Hang() {

    fun nhap(kickThuoc : Float, name : String = "",nSX : NSX = NSX(), donGia : Int = 0) {
        this.kickThuoc = kickThuoc
        this.ngayNhap = Util.getDateNow()
        this.name = name
        this.nSX = nSX
        this.donGia = donGia
    }

    fun show() {
        println("" + name + "\n" + kickThuoc + "\n" + nSX.tenNSX + "\n" + ngayNhap.showDate()
        )
    }
}