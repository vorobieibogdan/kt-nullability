package mate.academy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TotalPriceTest {
    @Test
    fun test_calculateTotalPrice_defaultProductPrice() {
        val expected = 89.97
        val actual = calculateTotalPrice(null, 3)
        assertEquals(expected, actual, 0.001)
    }

    @Test
    fun test_calculateTotalPrice_singleProduct() {
        val expected = 19.99
        val actual = calculateTotalPrice(19.99, 1)
        assertEquals(expected, actual, 0.001)
    }

    @Test
    fun test_calculateTotalPrice_multipleProducts() {
        val price = 15.00
        val expected = 75.00
        val actual = calculateTotalPrice(price, 5)
        assertEquals(expected, actual, 0.001)
    }
}
