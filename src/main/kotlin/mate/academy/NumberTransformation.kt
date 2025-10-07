package mate.academy

/*
    Implement the function. The input String may contain number or be null.
    If the number is present, multiply it by 3, then add 10 and return the reminder of dividing by 11.
    If the number is not present return null
 */

fun getReminder(numberStr: String?): Int? {
    return numberStr?.toIntOrNull()?.let {
        (it * 3 + 10) % 11
    }
}
