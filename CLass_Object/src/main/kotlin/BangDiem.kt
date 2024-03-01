class BangDiem(
    val listDiem: ArrayList<DiemModel> = ArrayList<DiemModel>()
)
{
    fun hienThi(){
        println(String.format("%5s %5s %10s %6s %5s", "STT", "Ma HP", "Ten HP", "So TC", "Diem"))

        listDiem.forEachIndexed { index, diemM ->
            println(String.format("%5s %5s %10s %6s %5s", index+1, diemM.hocPhan.maHP, diemM.hocPhan.tenHP, diemM.hocPhan.sTC, diemM.diem))
        }

    }
}

