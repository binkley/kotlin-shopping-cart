package hm.binkley.shoppingcart

public data class ShoppingCartItem(
    /** Note that UPC can also be represented as either a decimal or a long. */
    val upc: String,
) {
    /**
     * Description may vary by store and country, but if the same UPC barcode,
     * they all ring up the same at checkout.
     */
    override fun equals(other: Any?): Boolean =
        this === other ||
            other is ShoppingCartItem &&
            upc == other.upc

    override fun hashCode(): Int = upc.hashCode()
}
