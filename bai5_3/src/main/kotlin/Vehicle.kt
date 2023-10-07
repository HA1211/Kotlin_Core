import com.sun.org.apache.xml.internal.security.utils.XMLUtils

abstract class Vehicle(
    var nhanHieu: String = "",
    var namSx: Int = 0,
    var hang: String = ""
) {
    abstract fun Nhap()
    abstract fun Xuat()
}