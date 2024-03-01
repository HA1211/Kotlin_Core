import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.FileOutputStream
import java.io.FileReader
import java.io.FileWriter
import java.lang.ArithmeticException
import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*

fun main() {
    //-----------------------------------------------------------------------------------------------------
                            //HashMap

//    val map = HashMap<String, Int>()
//
//    map.put("anh",6 )
//    map.put("hiep", 5)
//
//    println(map.containsKey("anh"))

    //-----------------------------------------------------------------------------------------------------
                            //Thời gian

//    val cal = Calendar.getInstance() đây là cách hiển thị ngày hiện tại
//    val simple = SimpleDateFormat("dd/MM/yyyy")
//
//    println(simple.format(cal.time))

//    val date: LocalDate = LocalDate.of(ngay, thang, nam) đây là 1 cách hiển thị ngày theo người dùng nhập

//    val date: Date = Date(24-8-2002)      đây là 1 cách khác cũng hiển thị ngày theo người dùng nhập
//    val dateFormat = SimpleDateFormat("dd/MM/yyyy")
//    val ngaySinh = dateFormat.parse(date)


    //-----------------------------------------------------------------------------------------------------
                            //Xử lí ngoại lệ

//    try {
//        val x = chia(8, 2)
//    } catch (e: TaoException) {
//        e.printStackTrace()
//    } catch (e: ArithmeticException) {
//        println("Loi chia 0")
//    } catch (e: NullPointerException) {
//        println("null")
//    } catch (e: Exception) {
//        e.printStackTrace() // cái này là bắt buộc, để cuối cùng vì là lỗi chung
//    } finally {
//        println("Dung hay sai thi van hien thi")
//    }



    //-----------------------------------------------------------------------------------------------------
                            //Luồng

//    val thread = Thread(object :Runnable{
//        override fun run() {
//            Thread.sleep(2000)
//            println("1")
//        }
//    })
//
//    thread.start()
//    println("2")

//    val tinh = TinhToan(10)
//    tinh.start()


    //-----------------------------------------------------------------------------------------------------
                         //Đọc File
//    try {
//        val fr: FileReader = FileReader("D:\\New folder\\Text.txt")
//        val bfr = BufferedReader(fr)
//        var line = bfr.readLine()
//
//        while (line != null){
//            println(line)
//            line = bfr.readLine()
//        }
//        bfr.close()  //phải đóng file lại
//
//    }catch (e : Exception){
//        e.printStackTrace()
//    }

    //-----------------------------------------------------------------------------------------------------
                            //Ghi File
//    try {
//        val fw: FileWriter = FileWriter("D:\\New folder\\Text.txt", true) //true được sử dụng để cho phép ghi thêm dữ liệu vào tệp
//
//        val bfw = BufferedWriter(fw, 1)
//
//        bfw.write("Nahhh")
//
//        bfw.close()
//
//    }catch (e: Exception){
//        e.printStackTrace()
//    }

}


    //-----------------------------------------------------------------------------------------------------
                    //Hàm này của try catch

//fun chia(x: Int, y : Int): Int{
//    if(y==2){
//        throw TaoException()
//    }
//    return x/y
//}

    //-----------------------------------------------------------------------------------------------------