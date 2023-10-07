class MayGiat(
    var dungTich: Double = 0.0,
    var loai: String = ""
): Electronic() {

    fun create(congSuat: Double,dienAp: Double,dungTich: Double,loai: String){
        super.congSuat = congSuat
        super.dienAp = dienAp
        this.dungTich = dungTich
        this.loai = loai
    }
    override fun electronic() {

    }

    fun Xuat() {

    }
}