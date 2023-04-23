import java.math.BigDecimal
import java.math.MathContext

fun main() {
    println((1..100L)
        .map { naturalNumber -> BigDecimal.valueOf(naturalNumber) }
        .map { it.sqrt(MathContext(110)) }
        .map { bigDecimal -> bigDecimal.toString() }
        .filter { it.contains(Regex("\\.")) }
        .map { it.substring(0, 101) }
        .map { it.replace(".", "") }
        .flatMap { it.split("") }
        .filter { "" != it }
        .sumOf { it.toLong() })
}