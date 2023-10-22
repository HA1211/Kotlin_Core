import java.util.Calendar

class Date(
    var day: Int= 0,
    var thang: Int =0,
    var nam: Int =0,
) {
    fun showDate() : String {
        return String.format("%02d/%02d/%02d", day, thang, nam)
    }
}