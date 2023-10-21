import java.util.Calendar

object Unit {
    fun getDate(): Date{
        val cal = Calendar.getInstance()
        return Date(cal.get(Calendar.DATE), cal.get(Calendar.MONTH)+1, cal.get(Calendar.YEAR))
    }
}