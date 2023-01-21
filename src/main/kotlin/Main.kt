import kotlin.math.log

fun main() {
    println("Программа нахождения целочисленного показателя степени (x^y=n)")
    print("Введите число (n): ")
    val n: Float = readln().toFloat()
    print("Введите основание степени (x): ")
    val x: Float = readln().toFloat()
    if (log(n, x) % 1.0f == 0.0f) println("Целочисленный показатель степени = ${log(n, x)}")
    else println("Целочисленного показателя не существует")
}