class PhieuMuaHang (
    var id: Int = 0,
    var ten: String = "",
    var maPhieu:String = "",
    var ngayLap:Date = Date(),
){

    fun nhapPhieu(ten: String ,id: Int,maPhieu: String){
        this.ten = ten
        this.id = id
        this.maPhieu = maPhieu
        this.ngayLap = Util.getDateNow()
    }

    fun show1(){
        println(String.format("%20s %20s %20s %20s","Ma phieu: $maPhieu","" ,"Ngay lap: ${ngayLap.showDate()}",""))
    }
}