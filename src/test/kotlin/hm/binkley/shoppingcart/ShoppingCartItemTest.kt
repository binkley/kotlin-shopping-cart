package hm.binkley.shoppingcart

import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import org.junit.jupiter.api.Test

val FLOOR_WAX_UPC = UPC("00123456789012")
val FLOOR_WAX = ShoppingCartItem(upc = FLOOR_WAX_UPC)

internal class ShoppingCartItemTest {
    private operator fun UPC.plus(suffix: String): UPC =
        UPC(this.toString() + suffix)

    @Test
    fun `items should have UPCs`() {
        val item = FLOOR_WAX

        item.upc shouldBe FLOOR_WAX_UPC
    }

    @Test
    fun `items should equate by UPC`() {
        FLOOR_WAX.equals(FLOOR_WAX) shouldBe true
        FLOOR_WAX.equals(this) shouldBe false

        val sameItem = ShoppingCartItem(upc = FLOOR_WAX_UPC)
        val otherItem = ShoppingCartItem(upc = FLOOR_WAX_UPC + "7")

        FLOOR_WAX.equals(sameItem) shouldBe true
        FLOOR_WAX.equals(otherItem) shouldBe false
    }

    @Test
    fun `items should hash by UPC for use in maps`() {
        FLOOR_WAX.hashCode() shouldNotBe System.identityHashCode(FLOOR_WAX)

        val sameItem = ShoppingCartItem(upc = FLOOR_WAX_UPC)
        val otherItem = ShoppingCartItem(upc = FLOOR_WAX_UPC + "7")

        FLOOR_WAX.hashCode() shouldBe sameItem.hashCode()
        FLOOR_WAX.hashCode() shouldNotBe otherItem.hashCode()
    }
}
