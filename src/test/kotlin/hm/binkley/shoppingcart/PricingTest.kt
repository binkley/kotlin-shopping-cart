package hm.binkley.shoppingcart

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldContain
import org.javamoney.moneta.Money
import org.junit.jupiter.api.Test

/**
 * One does not strictly need this test class&mdash;it is testing a class only
 * used for other tests&mdash;but it helps to see sources of test problems, and
 * this test class make those more explicit.
 */
internal class PricingTest {
    private val pricer = FakeTestPricer()

    @Test
    fun `should price items`() {
        val item = FLOOR_WAX_ITEM

        pricer.price(item) shouldBe Money.of(3.50, "USD")
    }

    @Test
    fun `should complain about unknown items`() {
        val unknownItem = DIFFERENT_ITEM

        val e =
            shouldThrow<IllegalArgumentException> {
                pricer.price(unknownItem)
            }
        e.message.shouldContain(DIFFERENT_UPC_CODE)
    }
}
