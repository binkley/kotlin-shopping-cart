package hm.binkley.shoppingcart

private val FLOOR_WAX_UPC_CODE = "012345678905"

internal class FakeTestDescriber : Describer {
    override fun describe(item: ShoppingCartItem): String {
        require(UPC(FLOOR_WAX_UPC_CODE) == item.upc) {
            "Unknown UPC for describing in tests: ${item.upc}"
        }
        return "FLOOR WAX"
    }
}
