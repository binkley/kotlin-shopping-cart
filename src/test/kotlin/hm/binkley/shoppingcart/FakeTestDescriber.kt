package hm.binkley.shoppingcart

internal class FakeTestDescriber : Describer {
    override fun describe(item: ShoppingCartItem): String {
        require(FLOOR_WAX_UPC == item.upc) {
            "Unknown UPC for describing in tests: ${item.upc}"
        }
        return "FLOOR WAX"
    }
}
