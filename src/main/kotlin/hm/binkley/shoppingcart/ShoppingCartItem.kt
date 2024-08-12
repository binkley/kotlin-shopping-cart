package hm.binkley.shoppingcart

/**
 * A shopping cart item: a user view of items that shoppers add/remove.
 * Some UPC codes need additional information such as quantity/weight to
 * process further, and other systems likely aggregate.
 *
 * Other possible data values, and why they should be outside the scope:
 * - Description &mdash; it is tempting to include this; however, the same
 *    item may be named differently in different locations, and certainly
 *    changes with different languages.
 * - Price &mdash; pricing changes frequently, and across locations, regions,
 *    and countries.
 *    Best to defer to another service to price any given UPC product.
 *
 * @see Pricer
 */
data class ShoppingCartItem(
    val upc: UPC,
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
