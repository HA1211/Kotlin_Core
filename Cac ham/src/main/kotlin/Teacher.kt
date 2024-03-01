class Teacher(
    private var tuoi: Int,
    var namCT: Int
) {
    fun setTuoi(tuoi: Int){
        this.tuoi = tuoi
    }

    override fun toString(): String {
        return String.format("Teacher: $tuoi $namCT")
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }
}