fun main() {
    val amount = 100
    val regularUser = true
    var result: Int

    if (amount >= 10001) {
        result = amount - (amount * 0.05).toInt()
    } else if (amount >= 1001 && amount <= 10000) {
        result = amount - 100
    } else {
        result = amount
    }

    if (regularUser) {
        result = result - (result * 0.01).toInt()
    }

    println(result)
}