class DotPrinter(
    var matDoKim: Double = 0.0
): Printer() {

    fun create(trongLuong: Double, hangSx: String, namSx: Int, tocDo: Double, matDoKim: Double){
        super.trongLuong = trongLuong
        super.hangSx = hangSx
        super.namSx = namSx
        super.tocDo = tocDo
        this.matDoKim = matDoKim
    }
    override fun Nhap() {

    }

    override fun Xuat() {

    }

}