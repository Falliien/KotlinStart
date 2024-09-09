fun main(){

    val startTrainHour = 9
    val startTrainMinute = 39
    val oneHour60min = 60
    val travelTimeMinute = 457

    val startTrainHourInMinute = startTrainHour * oneHour60min +startTrainMinute
    val finishTravelTrain = startTrainHourInMinute + travelTimeMinute

    val finishTravelHour = finishTravelTrain / oneHour60min
    val finishTravelMinute = finishTravelTrain - (finishTravelHour * oneHour60min)
    val red = "\u001b[31m"

    print( red + "Время прибытия поезда         " )
    print( finishTravelHour)
    print(":")
    print(finishTravelMinute)

println()
}
