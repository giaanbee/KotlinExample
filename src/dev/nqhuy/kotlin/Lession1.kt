package dev.nqhuy.kotlin

/*
 * Created by Chang Bee on 5/28/2017.
 */
fun main(args: Array<String>) {
    println("Kotlin anh đến với em đây")

    var x: Int = 10
    if (x % 2 == 0)
        println("So chan")
    else
        println("So le")

    x = 100

    var s: String = if (x == 100) {
        "so dep"
    } else if (x == 50) {
        "so hoi dep"
    } else "so xau"

    println(s)


    // -----------------------Câu lệnh rẽ nhánh
    var name = "Huy"
    when (name) {
        "Huy" -> println("Chồng")
        "Chang" -> println("Vợ")
        else -> println("khong biet")
    }

    // So thap phan
    var diem: Double = 9.5
    when (diem) {
        5.0 -> println("trung binh")
        8.0 -> println("gioi")
        6.5 -> println("kha")
        else -> println("Loai kem")
    }

    // When có vai trò như 1 biểu thức

    var number = 2
    var s1 = when (number) {
        10 -> "Hello"
        5, 6, 7, 8 -> "Good"
        in 1..4 -> "khong dat" // muốn so sánh với khoản dùng từ khóa "in"
        else -> "khac"
    }

    println(s1)

    //
    var x123: Any = "Hello"
    when (x123) {
        is String -> println("la` String")
        is Double -> println("Thap phan")
        else -> println("khac")
    }

    //
    number = 10
    when {
        number % 2 == 0 -> println("so chan")
        else -> println("So le")
    }

    //Vong lap----------------------------------------
    var fx = 0
    var index = 0
    var n = 10
    while (index <= n) {
        fx += index
        index++
    }
    println("Fx =$fx")


    // vong for
    //kotlin
    var formmmm = 10
    for (i in 0..formmmm) {
        println(i)
    }

    //Step =>Bước nhảy
    //downto => Gioi han gai tri khi giam
    //in ra cac so chan > 0 va nho on 19
    println("------------------------")
    var max = 19
    for (i in 0..max step 2) {
        print("$i ")
    }

    // Duyệt theo kiểu giảm
    if (max % 2 != 0) {
        max--
    }

    for (i in max downTo 0 step 2) {
        print("$i ")
    }

    //Tinh fx = 1 + 2 + .. + n
    println("\n-----------------------")
    fx = 0
    n = 10
    for (i in 1..n) {
        fx += i
    }

    println(fx)


    // cho n = 10 in ra 1->9
    println("\n-----------------------")
    for (i in 1 until 10) {
        println(i)
    }

    // Continue => bỏ qua các câu leemnhj dưới nó
    println("\n-----------------------")
    for (i in 1..5) {
        if (i == 4) break
        println(i)
    }


    //Goto den 1 nhãn
    println("\n-----------------------")

    cha@ for (i in 0..10) {
        print("Cha= $i : ")
        for (j in 1..10) {

            print("$j - ")
            if(j == 6) break@cha //thoat khỏi vòng lặp
        }
        println("")
    }

}