package mate.academy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

class NumberTransformationTest {
    @Test
    fun test_getReminder_ReturnValidReminder() {
        val expected = 10
        val actual = getReminder("11")
        assertEquals(expected, actual)
    }

    @Test
    fun test_getReminder_ReturnZeroReminder() {
        val expected = 0
        val actual = getReminder("4")
        assertEquals(expected, actual)
    }

    @Test
    fun test_getReminder_ReturnNullValue() {
        val actual = getReminder(null)
        assertNull(actual)
    }
}
