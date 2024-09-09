fun main() {

    val worker = 50
    val paymentWorker = 30000
    val intern = 30
    val paymentIntern = 20000

    val expensesWorker = worker * paymentWorker
    println("Расходы на выплату зарплаты постоянных сотрудников")
    println(expensesWorker)

    val exceptionInternWorker = (intern * paymentIntern)+expensesWorker
    println("Общие расходы по ЗП после прихода стажеров")
    println(exceptionInternWorker)

    val averageSalaryWorkerIntern = exceptionInternWorker/(worker+intern)
    println("Средняя ЗП одного сотрудника после устройства стажеров")
    println(averageSalaryWorkerIntern)

}
