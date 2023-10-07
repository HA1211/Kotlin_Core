abstract class Printer(
    var trongLuong: Double = 0.0,
    var hangSx: String = "",
    var namSx: Int = 0,
    var tocDo: Double = 0.0
) {
    abstract fun Nhap()

    abstract fun Xuat()

}