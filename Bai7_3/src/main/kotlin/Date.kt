class Date(
    var ngay:Int = 0,
    var thang:Int = 0,
    var nam:Int = 0
) {
    fun showDate() : String {
        return String.format("%02d/%02d/%02d", ngay, thang, nam)
    }
}