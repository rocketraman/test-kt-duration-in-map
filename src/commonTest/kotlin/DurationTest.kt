import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.time.Duration.Companion.seconds
import kotlin.time.DurationUnit

class DurationTest {
  @Test
  fun durationInMap() {
    val tests = mapOf(
      15.seconds to 0L,
    )

    tests.forEach { (input, output) ->
      assertEquals(input.toLong(DurationUnit.DAYS), output)
    }
  }

  @Test
  fun durationInListOfPairs() {
    val tests = listOf(
      15.seconds to 0L,
    )

    tests.forEach { (input, output) ->
      assertEquals(input.toLong(DurationUnit.DAYS), output)
    }
  }
}
