package hm.binkley.shoppingcart

import org.javamoney.moneta.Money

internal class FakeTestPricer : Pricer {
    override fun price(item: ShoppingCartItem): Money {
        require(FLOOR_WAX_UPC == item.upc) {
            "Unknown UPC for pricing in tests: ${item.upc}"
        }
        return Money.of(3.50, "USD") // Everything is tree fiddy
    }
}
