package hm.binkley.shoppingcart

@JvmInline
value class UPC(private val code: String) {
    init {
        require(12 == code.length) { "Not a valid UPC (12 digits): $code" }
    }
}
