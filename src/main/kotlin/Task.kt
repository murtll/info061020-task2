import java.io.File
import kotlin.math.max

fun main() {
    println(task("out\\production\\task2\\27986_A.txt"))
    println(task("out\\production\\task2\\27986_B.txt"))
}

fun task(filename: String): Int {
    var controlSum = 1

    val nums = File(filename).readLines().map { it.toInt() }.toMutableList().also { it.removeAt(it.lastIndex) }

    nums.forEach { first ->
        nums.forEach{ second ->

            val current = first * second

            if (current % 7 == 0 && current % 49 != 0) {
                controlSum = max(current, controlSum)
            }
        }
    }

    return controlSum
}