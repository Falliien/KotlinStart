package lesson_3

fun main() {

    val ishod = 57
    val tablica = """
     |$ishod x 1 = ${1 * ishod}
     |$ishod x 2 = ${2 * ishod}
    |$ishod x 3 = ${3 * ishod}
    |$ishod x 4 = ${4 * ishod}
     |$ishod x 5 = ${5 * ishod}
  |$ishod x 6 = ${6 * ishod}
    |$ishod x 7 = ${7 * ishod}
    |$ishod x 8 = ${8 * ishod}
   |$ishod x 9 = ${9 * ishod}
    |$ishod x 10 = ${10 * ishod}
""".trimMargin()

    println(tablica)
}