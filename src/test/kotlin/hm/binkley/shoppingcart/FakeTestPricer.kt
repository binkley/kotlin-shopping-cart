package hm.binkley.shoppingcart

import org.javamoney.moneta.Money

private val FLOOR_WAX_UPC_CODE = "012345678905"

internal class FakeTestPricer : Pricer {
    override fun price(item: ShoppingCartItem): Money {
        require(UPC(FLOOR_WAX_UPC_CODE) == item.upc) {
            "Unknown UPC for tests: ${item.upc}"
        }
        return Money.of(3.50, "USD") // Everything is tree fiddy
    }
}
