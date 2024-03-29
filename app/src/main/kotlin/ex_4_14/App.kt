/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package ex_4_14


fun <T> unfold(seed: T, f: (T) -> T, p: (T) -> Boolean): List<T> {
    tailrec fun unfold_(acc: List<T>, seed: T): List<T> =
            if (p(seed))
                unfold_(acc + seed, f(seed))
            else
                acc
    return unfold_(listOf(), seed)
}

fun range(start: Int, end: Int): List<Int> = unfold(start, { it + 1 }, { it <=end })

class App {
    val greeting: String
        get() {
            return "package ex_4_14"
        }
}

fun main() {
    println(App().greeting)
	println(range(1,10))
	
}
