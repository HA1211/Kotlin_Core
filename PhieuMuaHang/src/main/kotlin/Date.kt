

class Date(
    var day:Int = 0,
    var month:Int = 0,
    var year:Int = 0
) {
    fun showDate() : String {
        return String.format("%02d/%02d/%02d", day, month, year)
    }
}