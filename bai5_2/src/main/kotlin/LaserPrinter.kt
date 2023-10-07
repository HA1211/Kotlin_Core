class LaserPrinter(
    var doPhanGiai: Double = 0.0
): Printer() {

    fun create(trongLuong: Double, hangSx: String, namSx: Int, tocDo: Double, doPhanGiai: Double){
        super.trongLuong = trongLuong
        super.hangSx = hangSx
        super.namSx = namSx
        super.tocDo = tocDo
        this.doPhanGiai = doPhanGiai
    }
    override fun Nhap() {

    }

    override fun Xuat() {

    }
}