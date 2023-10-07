class TuLanh(
    var dungTich: Double = 0.0,
    var soNgan: Int = 0
): Electronic() {

    fun create(congSuat: Double, dienAp: Double,dungTich: Double,soNgan: Int) {
        super.congSuat = congSuat
        super.dienAp = dienAp
        this.dungTich = dungTich
        this.soNgan = soNgan
    }

    override fun electronic() {

    }

    fun Xuat() {

    }

}