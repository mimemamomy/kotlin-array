import java.util.*
fun main() {

    println("Введите количество строк: ")
    val rows = readlnOrNull()?.toInt() ?: 0

    println("Введите количество столбцов: ")
    val columns = readlnOrNull()?.toInt() ?: 0

    val array = Array(rows) {IntArray(columns)}

    for (i in 0 until rows) {
        for (j in 0 until columns) {
            println("Введите трехзначные числа")
            array[i][j] = readlnOrNull()?.toInt() ?: 0
        }
    }
    println("Массив: ")
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            println("${array[i][j]}")
        }
    }
    val set = HashSet<Int>()
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            set.add(array[i][j])
        }
    }
    val lenght = set.size
    println("Количество различных цифр в массиве $lenght")
}