class KySu(
    var nganh: String = "",
    var namTN: Int = 0
): Person() {

    fun create(hoTen : String, ngaySinh : String, queQuan : String, nganh: String, namTN: Int){
        super.hoTen = hoTen
        super.ngaySinh = ngaySinh
        super.queQuan = queQuan
        this.nganh = nganh
        this.namTN = namTN
    }
    fun Nhap(){

    }

    fun Xuat(){

    }

}