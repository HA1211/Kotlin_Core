class Oto(
    var soChoNgoi: Int = 0,
    var dungTich: Int = 0
): Vehicle() {

    fun create(nhanHieu: String,namSx: Int,hang: String,soChoNgoi: Int,dungTich: Int){
        super.nhanHieu = nhanHieu
        super.namSx = namSx
        super.hang = hang
        this.soChoNgoi = soChoNgoi
        this.dungTich = dungTich
    }


    override fun Nhap(){

    }

    override fun Xuat() {

    }
}