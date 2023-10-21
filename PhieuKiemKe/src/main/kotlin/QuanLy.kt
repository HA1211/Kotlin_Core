
val listTs = ArrayList<TaiSan>()
fun main() {
    val bang = TaiSan()
    val phieu = PhieuKiemKe()
    phieu.nhapPhieu("PH01")

    val nv = NVKK()
    nv.nhapNV("Kieu Thi Thanh", "Ke toan vien")

    val phong = Phong()
    phong.nhapPhong("To chuc hanh chinh", "PTC", "Hoang Bich Thao")


    var t1 = TaiSan("May vi tinh", 5, TinhTrang.Tot)
    var t2 = TaiSan("May vi tinh", 3, TinhTrang.HetKhauHaoHong)
    var t3 = TaiSan("Ban lam viec", 6, TinhTrang.Tot)

    listTs.add(t1)
    listTs.add(t2)
    listTs.add(t3)

    phieu.hienThi()
    nv.hienThi()
    phong.hienThi()
    bang.hienThi()

}