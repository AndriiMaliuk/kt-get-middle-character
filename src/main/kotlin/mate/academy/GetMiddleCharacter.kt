package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    if (originalString.isEmpty()) return ""
    val result = StringBuilder()
    if (originalString.length % 2 == 0) {
        result.append(originalString[originalString.length / 2 - 1])
        result.append(originalString[originalString.length / 2])
        return result.toString()
    } else {
        result.append(originalString[(originalString.length / 2)])
        return result.toString()
    }
}
