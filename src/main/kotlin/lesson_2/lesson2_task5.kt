fun main() {
    val deposit = 70000
    val procentnayStavka = 16.7
    val periodVkladaYear = 20

    val finish = deposit.toDouble() * Math.pow((1 + procentnayStavka.toDouble() / 100.00), periodVkladaYear.toDouble())
    println("%.3f".format(finish))
}

