package hm.binkley.shoppingcart

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldContain
import org.junit.jupiter.api.Test

private val FLOOR_WAX_UPC_CODE = "012345678905"
private val DIFFERENT_UPC_CODE = "065100004327"

internal class DescribingTest {
    private val describer = FakeTestDescriber()

    @Test
    fun `should describe items`() {
        val item = ShoppingCartItem(upc = UPC(FLOOR_WAX_UPC_CODE))

        describer.describe(item) shouldBe "FLOOR WAX"
    }

    @Test
    fun `should complain about unknown items`() {
        val unknownItem = ShoppingCartItem(upc = UPC(DIFFERENT_UPC_CODE))

        val e =
            shouldThrow<IllegalArgumentException> {
                describer.describe(unknownItem)
            }
        e.message.shouldContain(DIFFERENT_UPC_CODE)
    }
}
