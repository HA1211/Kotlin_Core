fun main() {
    val oto = Oto()
    oto.create("s", 2020, "toyota", 4, 80)
    val moto = Moto()
    moto.create("a", 2021, "yamaha",  120)
    println(String.format("%15s %15s %15s %15s %15s %15s %15s"," " ,       "Nhan hieu",  "Nam sx",   "Hang",    "Phan Khoi",    "So cho ngoi", "Dung tich"))
    println(String.format("%15s %15s %15s %15s %15s %15s %15s","Xe oto :", oto.nhanHieu, oto.namSx,   oto.hang, "",              oto.soChoNgoi, oto.dungTich))
    println(String.format("%15s %15s %15s %15s %15s %15s %15s","Xe moto:" ,moto.nhanHieu, moto.namSx, moto.hang, moto.phanKhoi, "",             ""))
}