class PhieuMuaHang (
    var id: Int = 0,
    var ten: String = "PHIEU MUA HANG",
    var maPhieu:String = "",
    var ngayLap:Date = Date(),
){

    fun nhapPhieu(maPhieu: String){
        this.maPhieu = maPhieu
        this.ngayLap = Util.getDateNow()
    }

    fun show1(){
        println(String.format("%40s \n %20s %20s %20s %20s",ten,"Ma phieu: $maPhieu","" ,"Ngay lap: ${ngayLap.showDate()}",""))
    }
}