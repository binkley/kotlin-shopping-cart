package hm.binkley.shoppingcart

@JvmInline
value class UPC(private val code: String) {
    init {
        require(12 == code.length) { "Not a valid UPC (12 digits): $code" }
        require(validChecksum(code)) { "Not a valid UPC (checksum): $code" }
    }
}

/**
 * See
 * https://en.wikipedia.org/wiki/Universal_Product_Code#Check_digit_calculation.
 * Note that reference is 1-based for counting UCP code digits, and the code
 * is 0-based (Java list).
 */
private fun validChecksum(code: String): Boolean {
    val checksum =
        code
            .map { it.digitToInt() }
            .mapIndexed { index, n -> if (0 == index % 2) 3 * n else n }
            .sum()

    return 0 == checksum % 10
}
