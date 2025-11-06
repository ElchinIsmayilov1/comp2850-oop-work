import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class WordleTest : StringSpec({
    "should return true for string length 5" {
        isValid("hello") shouldBe true
    }

    "should return false for string length !5" {
        isValid("helo") shouldBe false
    }

    "should return false for empty string" {
        isValid("") shouldBe false
    }

    "should return false for string length 5 but with empty spaces" {
        isValid("hel o") shouldBe false
    }

    "should return 2 for finding the word" {
        evaluateGuess("hello", "HELLO") shouldBe listOf(2, 2, 2, 2, 2)
    }

    "should return 1 for finding the letter but wrong position" {
        evaluateGuess("eholl", "HELLO") shouldBe listOf(1, 1, 1, 2, 1)
    }

    "should return 0 for not finding the letter" {
        evaluateGuess("guess", "HELLO") shouldBe listOf(0, 0, 1, 0, 0)
    }
})
