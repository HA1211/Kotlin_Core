

var listKySu = ArrayList<KySu>()


fun main(){
    addKySu("hiep", "24/08/2002", "dc", "attt", 2023)
    addKySu("quy", "09/03/2002", "tb", "cntt", 2020)
    addKySu("manh", "05/08/2002", "dc", "dtvt", 2023)
    addKySu("manh", "05/08/2002", "dc", "dtvt", 2021)
    addKySu("manh", "05/08/2002", "dc", "dtvt", 2029)
    addKySu("manh", "05/08/2002", "dc", "dtvt", 2024)
    addKySu("manh", "05/08/2002", "dc", "dtvt", 2024)

    println("---------------------------------------------------------------------")
    println(String.format("%10s %20s %10s %10s %10s", "Ho ten", "Ngay sinh", "Que quan", "Nganh", "Nam TN"))

    showAll()

    println("---------------------------------------------------------------------")

    println("Danh sach Ky Su moi tot nghiep: ")
    showDsMoiTN()
}

fun addKySu(hoTen: String, ngaySinh: String, queQuan: String, nganh: String, namTN: Int){
        val ks = KySu()
        ks.create(hoTen, ngaySinh, queQuan, nganh, namTN)
        listKySu.add(ks)
}

fun showAll(){
    listKySu.forEach {
        println(String.format("%10s %20s %10s %10s %10s", it.hoTen, it.ngaySinh, it.queQuan, it.nganh, it.namTN))
    }
}



fun showDsMoiTN(){
    var max = 0
    for(ks in listKySu){
        if(ks.namTN > max){
            max = ks.namTN
        }
    }
    for(ks in listKySu) {
        if (ks.namTN == max) {
            println(String.format("%10s %20s %10s %10s %10s", ks.hoTen, ks.ngaySinh, ks.queQuan, ks.nganh, ks.namTN))
        }
    }
}