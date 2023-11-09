import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import kotlin.time.Duration.Companion.seconds
import kotlin.time.DurationUnit

class DurationKoTest : FunSpec({
  test("Duration in map") {
    val tests = mapOf(
      15.seconds to 0L,
    )

    tests.forEach { (input, output) ->
      input.toLong(DurationUnit.DAYS) shouldBe output
    }
  }

  test("Duration in list of pairs") {
    val tests = listOf(
      15.seconds to 0L,
    )

    tests.forEach { (input, output) ->
      input.toLong(DurationUnit.DAYS) shouldBe output
    }
  }
})
