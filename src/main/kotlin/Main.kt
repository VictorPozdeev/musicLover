fun main() {
    val amount = 10000
    val regularUser = true
    var result: Int

    when (amount) {
        in 0..1000 -> result = amount
        in 1001..10000 -> result = amount - 100
        else -> result = amount - (amount * 0.05).toInt()
    }

    if (regularUser) {
        result = result - (result * 0.01).toInt()
    }

    println(result)
}