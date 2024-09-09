const val ONE_MIN_60_SEK = 60
const val ONE_HOUR_36000_SEC = 3600

fun main() {

    val totalSecond = 6480
    val totalHour = totalSecond / ONE_HOUR_36000_SEC
    val remainSecond = totalSecond % ONE_HOUR_36000_SEC
    val totalMinute = remainSecond / ONE_MIN_60_SEK
    val remainSecond2 = remainSecond % ONE_MIN_60_SEK

    print("Гагарин провел в космосе " + String.format("%02d:%02d:%02d", totalHour, totalMinute, remainSecond2))

    }
