fun main() {
    val oto = Oto()
    oto.create("s", 2020, "toyota", 4, 50)
    val moto = Moto()
    moto.create("a", 2021, "yamaha",  120)
    println(String.format("%20s %15s %15s %15s %15s %15s", "Nhan hieu", "Nam sx","Hang","Phan Khoi","So cho ngoi", "Dung tich"))
    println(String.format("Xe oto: %5s %20s %19s %29s %15s",oto.nhanHieu, oto.namSx, oto.hang, oto.soChoNgoi, oto.dungTich))
    println(String.format("Xe moto:%5s %20s %19s %13s", moto.nhanHieu, moto.namSx, moto.hang, moto.phanKhoi))
}