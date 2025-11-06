fun main() {
  val s = readWordList("data/words.txt")
  val r = pickRandomWord(s)
  var attempt = 0
  val correct = listOf(2, 2, 2, 2, 2)
  while (attempt < 6) {
      attempt += 1
      val guess = obtainGuess(attempt)
      val bar = evaluateGuess(guess, r)
      if (bar == correct) {
          println("You Won!")
          break
      } else {
          if (attempt == 6) {
              println("You lost!")
              println("Word was $r")
          } else {
              displayGuess(guess, bar)
              println("\nTry Again!")
          }
      }
  }
}
