const val TABLE_IN_RESTAURANT = 13
fun main() {
    val reserveToday = 13
    val reserveTomorrow = 9
    println("[Доступность столиков на сегодня : ${TABLE_IN_RESTAURANT > reserveToday}] \n[Доступность столиков на завтра : ${TABLE_IN_RESTAURANT > reserveTomorrow}]")
}
