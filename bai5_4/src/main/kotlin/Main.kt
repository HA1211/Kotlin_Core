fun main() {
    val mg = MayGiat()
    val tl = TuLanh()

    mg.create(100.0, 20.0, 7.0, "Toshiba")
    tl.create(90.0, 17.0, 5.0, 2)

    println(String.format("%12s %12s %12s %12s %12s %12s","          ","Cong suat",  "Dien ap","Dung tich", "Loai", "So ngan"))
    println(String.format("%12s %12s %12s %12s %12s %12s","May giat",   mg.congSuat, mg.dienAp, mg.dungTich, mg.loai, ""))
    println(String.format("%12s %12s %12s %12s %12s %12s","Tu lanh",    tl.congSuat, tl.dienAp, tl.dungTich,"       ", tl.soNgan))
}