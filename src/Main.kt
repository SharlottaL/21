//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   //21.1
    println("Введите n кол-во товара")
    val colT = readln().toInt()
    val colC = IntArray(colT)
    for (i in 0 until colT)
    {
        println("Введите цену:")
        colC[i]=readln().toInt()
    }
    var sum = 0
    var maxPrice = colC[0]
    var maxIndex = 0;
    for (i in 0 until colT)
    {
        val num = i + 1
        println("$num. ${colC[i]} руб")
        sum += colC[i]
        if (colC[i]>maxPrice)
        {
            maxPrice = colC[i]
            maxIndex = i
        }

    }
    println("Итого: $sum")
    println("Самая дорогая позиция: №${maxIndex+1}:  $maxPrice р")

    //21.2
    val n = BooleanArray(10)
    while(true)
    {
        println("Введите номер местa от 1ого до 10ти, 0 если всё")
        printSeats(n)
        var number = readln().toInt()
        if (number == 0) break
        if(number !in 1..10 ) {
            println("Ввод неверный")
            continue
        }

        val index = number - 1
        if(n[index])
        {
            println("Место $number занято")
        }
        else
        {
            n[index] = true
            println("Место $number Вы успешно забронированли")
        }
        println()
    }
    printSeats(n)
    println("\nСвободные нечётные:")
    for (i in 1..n.size step 2) {
        if (!n[i - 1]) print("$i ")
    }
    println()

    println("Свободные чётные:")
    for (i in 2..n.size step 2) {
        if (!n[i - 1]) print("$i ")
    }
}
fun printSeats(n: BooleanArray)
{
    for (i in n.indices)
    {
        print(if(n[i]) "[x]" else "[ ]")
    }
    println()
    for (i in n.indices)
    {
       val num = i + 1
        print(if(num <= 10) " $num " else " ")
    }
    println()

}