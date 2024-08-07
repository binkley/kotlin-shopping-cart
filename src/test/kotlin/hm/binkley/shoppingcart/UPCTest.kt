package hm.binkley.shoppingcart

import io.kotest.assertions.throwables.shouldNotThrow
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.string.shouldContain
import org.junit.jupiter.api.Test

private val FLOOR_WAX_UPC_CODE = "012345678905"

internal class UPCTest {
    @Test
    fun `should accept a valid UCP code`() {
        shouldNotThrow<IllegalArgumentException> {
            UPC("012345678905")
        }
    }

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
    fun `should helpfully complain if checksum is wrong`() {
        val invalidChecksumCode = "012345678907" // 7 != 5

        val e =
            shouldThrow<IllegalArgumentException> {
                UPC(invalidChecksumCode)
            }

        e.message.shouldContain(invalidChecksumCode)
    }
}
