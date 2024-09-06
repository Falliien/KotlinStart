fun main() {

    val second: Int = 6480
    val minute: Int = 60
//    println(second / minute)

    val hour = 108 / 60
//    println(hour)
    val minute2 = 108 - 60
//    println(minute2)
    val second2 = 0

    print("%02d".format (hour))
    print(":")
    print("%02d".format (minute2))
    print(":")
    print("%02d".format (second2))

}