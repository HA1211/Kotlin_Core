
fun main() {
    val st = Student()
    val fac = Faculty()


    st.student("Nguyen Quang Hiep","Ha Noi",Date(24,8,2002),"AT17H", 9.0)
    st.showSV()

    fac.giangVien("Nguyen Van A", School("KMA"))
    fac.showGV()
}