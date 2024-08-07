package hm.binkley.shoppingcart

import org.javamoney.moneta.Money

internal class FakeTestPricer : Pricer {
    override fun price(item: ShoppingCartItem) = Money.of(3.50, "USD")
}
