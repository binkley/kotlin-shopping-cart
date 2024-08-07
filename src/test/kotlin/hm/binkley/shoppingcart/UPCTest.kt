package hm.binkley.shoppingcart

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldNotBe
import io.kotest.matchers.string.shouldContain
import org.junit.jupiter.api.Test

val FLOOR_WAX_UPC_CODE = "012345678905"
val DIFFERENT_UPC_CODE = "065100004327"

internal class UPCTest {
    @Test
    fun `should helpfully complain if not a 12-digit code`() {
        val invalid10DigitCode = "1234567890"

        val e =
            shouldThrow<IllegalArgumentException> {
                UPC(invalid10DigitCode)
            }

        e.message.shouldContain(invalid10DigitCode)
    }

    @Test
    fun `should not equal with different codes`() {
        UPC(FLOOR_WAX_UPC_CODE) shouldNotBe UPC(DIFFERENT_UPC_CODE)
    }
}
