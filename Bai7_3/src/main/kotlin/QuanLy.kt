

fun main() {
    val khoa1 = Khoa("K1", "CNTT", "Nguyen Van A")
    val khoa2 = Khoa("K2", "ATTT", "Nguyen Van B")


    val ban1 = Ban("B1", "A", Date(1,4,2000))
    val ban2 = Ban("B2", "B", Date(2,4,2002))


    val truongDH = TruongDH(ArrayList(), ArrayList())

    truongDH.listKhoa.add(khoa1)
    truongDH.listKhoa.add(khoa2)

    truongDH.listBan.add(ban1)
    truongDH.listBan.add(ban2)

    truongDH.nhap("01", "KMA", "Chiến Thắng")
    truongDH.xuat()
}

