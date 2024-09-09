fun main() {

    val totalSecond = 6480
    val oneMin60Sek = 60
    val oneHour3600sec = 3600

    val totalHour = totalSecond / oneHour3600sec
    val remainSecond = totalSecond % oneHour3600sec
    val totalMinute = remainSecond / oneMin60Sek
    val remainSecond2 = remainSecond % oneMin60Sek

    print("Гагарин провел в космосе           " + String.format("%02d:%02d:%02d", totalHour, totalMinute, remainSecond2))

    }
