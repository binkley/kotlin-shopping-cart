package hm.binkley.shoppingcart

import javax.money.MonetaryAmount

interface Pricer {
    fun price(item: ShoppingCartItem): MonetaryAmount
}
