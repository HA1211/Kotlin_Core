fun main() {
    val tivi = createTivi()

    tivi.show()
}

fun createTivi() : Tivi{
    val tivi = Tivi()

    tivi.nhap(50f, "SamSung", NSX("SamSung Group", "Bắc Ninh"), 10000000)

    return tivi
}