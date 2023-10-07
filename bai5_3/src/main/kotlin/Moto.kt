class Moto(
    var phanKhoi: Int = 0
): Vehicle() {

    fun create(nhanHieu: String,namSx: Int,hang: String,phanKhoi: Int){
        super.nhanHieu = nhanHieu
        super.namSx = namSx
        super.hang = hang
        this.phanKhoi = phanKhoi
    }
    override fun Nhap() {

    }

    override fun Xuat() {

    }
}