
fun main(){

    val buff = 20.toDouble()
    val crystalMineral = 7
    val ironMineral = 11

    val crystalMineralBuff = crystalMineral * (1 + buff / 100)
    val crystalMineralBuff1 = crystalMineralBuff - crystalMineral

    val ironMineralBuff = ironMineral * (1 + buff / 100)
    val ironMineralBuff1 =ironMineralBuff - ironMineral


    println("Кристалическая руда под бафом      " + "%.0f".format(crystalMineralBuff1))
    println("Железная руда под бафом            " + "%.0f".format(ironMineralBuff1))



}