fun main() {
    val hocPhan1 = HocPhan(1, "Toan", 3)
    val hocPhan2 = HocPhan(5, "Ly", 4)
    val hocPhan3 = HocPhan(2, "Hoa", 2)

    val list = ArrayList<DiemModel>()
    list.add(DiemModel(hocPhan1, 8))
    list.add(DiemModel(hocPhan2, 9))
    list.add(DiemModel(hocPhan3, 10))

    val bangDiem = BangDiem(list)

    bangDiem.hienThi()
}