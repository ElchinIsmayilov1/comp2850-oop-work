fun evaluateGuess(guess: String, target: String): List<Int> {
    val a = guess.uppercase().toList()
    val b = target.uppercase().toList()
    val list = mutableListOf<Int>()
    for (i in 0..4) {
        if (a[i] == b[i]) {
            list.add(2)
        } else if (0 <= b.indexOf(a[i]) && b.indexOf(a[i]) <= 4) {
            list.add(1)
        } else {
            list.add(0)
        }
    }
    val matches = list.toList()
    return matches
}

fun displayGuess(guess: String, matches: List<Int>) {
    val yellow = "\u001b[33m"
    val white = "\u001b[37m"
    val green = "\u001b[32m"
    for (i in 0..4) {
        val a = guess[i]
        if (matches[i] == 2) {
            print("$green$a$white ")
        } else if (matches[i] == 1) {
            print("$yellow$a$white ")
        } else {
            print("$white? ")
        }
    }
}
