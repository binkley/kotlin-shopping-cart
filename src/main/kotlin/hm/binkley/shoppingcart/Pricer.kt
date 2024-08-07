package hm.binkley.shoppingcart

import javax.money.MonetaryAmount

public interface Pricer {
    public fun price(item: ShoppingCartItem): MonetaryAmount
}
