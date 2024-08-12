package hm.binkley.shoppingcart

import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import org.junit.jupiter.api.Test

internal class ShoppingCartItemTest {
    @Test
    fun `items should have UPCs`() {
        val item = FLOOR_WAX_ITEM

        item.upc shouldBe FLOOR_WAX_UPC
    }

    @Test
    fun `items should equate by UPC`() {
        // Simple check for equality
        FLOOR_WAX_ITEM.equals(FLOOR_WAX_ITEM) shouldBe true
        // Check that other object types are excluded for equality
        FLOOR_WAX_ITEM.equals(this) shouldBe false
        // Same constructor args should be equal
        val duplicateItem = ShoppingCartItem(upc = FLOOR_WAX_UPC)
        FLOOR_WAX_ITEM.equals(duplicateItem) shouldBe true
        // Different constructor args should not be equal
        FLOOR_WAX_ITEM.equals(DIFFERENT_ITEM) shouldBe false
    }

    @Test
    fun `items should hash by UPC for use in maps`() {
        // Hashing should be based on object data, not on JVM pointers
        FLOOR_WAX_ITEM.hashCode() shouldNotBe
            System.identityHashCode(FLOOR_WAX_ITEM)

        // Hashing the same cart item should be the same
        FLOOR_WAX_ITEM.hashCode() shouldBe
            ShoppingCartItem(upc = FLOOR_WAX_UPC).hashCode()
        // Hashing a different cart item should differ
        FLOOR_WAX_ITEM.hashCode() shouldNotBe DIFFERENT_ITEM.hashCode()
    }
}
