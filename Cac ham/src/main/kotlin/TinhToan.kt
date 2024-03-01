class TinhToan(
    var x : Int
): Thread() {
    override fun run() {
        super.run()

        for(i in 1..x){
            println(i)
            sleep(1000)  //hien thi sau 1 giay
        }
    }
}