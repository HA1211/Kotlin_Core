fun main() {

    val laser = LaserPrinter()
    laser.create(5.0, "Canon", 2023, 1000.0, 1260.0)
    val dot = DotPrinter()
    dot.create(6.0, "Hp", 2022, 100.0, 800.0)

    println(String.format("%31s %15s %15s %15s %15s %15s","Trong luong", "Hang","Nam sx","Toc do", "Do phan giai", "Mat do kim"))
    println(String.format("%15s %15s %15s %15s %15s %15s","May in laser:",laser.trongLuong, laser.hangSx, laser.namSx, laser.tocDo, laser.doPhanGiai))
    println(String.format("%15s %15s %15s %15s %15s %31s","May in kim:" ,dot.trongLuong, dot.hangSx, dot.namSx, dot.tocDo, dot.matDoKim))
}