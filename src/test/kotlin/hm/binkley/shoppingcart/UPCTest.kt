package hm.binkley.shoppingcart

import io.kotest.assertions.throwables.shouldNotThrow
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.string.shouldContain
import org.junit.jupiter.api.Test

private val KNOWN_VALID_UPC_CODE_FOR_TESTING = "012345678905"

internal class UPCTest {
    @Test
    fun `should accept a valid UPC code`() {
        shouldNotThrow<IllegalArgumentException> {
            UPC(KNOWN_VALID_UPC_CODE_FOR_TESTING)
        }
    }

    @Test
    fun `should helpfully complain if not a 12-digit code`() {
        // Skip the leading 0
        val invalidBecauseOf11Digits =
            KNOWN_VALID_UPC_CODE_FOR_TESTING.substring(1)

        val e =
            shouldThrow<IllegalArgumentException> {
                UPC(invalidBecauseOf11Digits)
            }

        e.message.shouldContain(invalidBecauseOf11Digits)
    }

    @Test
    fun `should helpfully complain if checksum is wrong`() {
        // Checksum last digit: 7 != 5
        val invalidBecauseOfChecksum =
            KNOWN_VALID_UPC_CODE_FOR_TESTING.replaceRange(11, 12, "7")
        val e =
            shouldThrow<IllegalArgumentException> {
                UPC(invalidBecauseOfChecksum)
            }

        e.message.shouldContain(invalidBecauseOfChecksum)
    }
}
