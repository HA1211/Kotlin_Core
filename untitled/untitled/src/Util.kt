import java.util.Calendar

object Util {
    fun getDateNow() : Date {
        val calendar = Calendar.getInstance()
        return Date(calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH), calendar.get(Calendar.YEAR))
    }
}