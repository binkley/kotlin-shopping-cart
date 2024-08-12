package hm.binkley.shoppingcart

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldContain
import org.junit.jupiter.api.Test

/**
 * One does not strictly need this test class&mdash;it is testing a class only
 * used for other tests&mdash;but it helps to see sources of test problems, and
 * this test class make those more explicit.
 */
internal class DescribingTest {
    private val describer = FakeTestDescriber()

    @Test
    fun `should describe items`() {
        val item = FLOOR_WAX_ITEM

        describer.describe(item) shouldBe "FLOOR WAX"
    }

    @Test
    fun `should complain about unknown items`() {
        val unknownItem = DIFFERENT_ITEM

        val e =
            shouldThrow<IllegalArgumentException> {
                describer.describe(unknownItem)
            }
        e.message.shouldContain(DIFFERENT_UPC_CODE)
    }
}
