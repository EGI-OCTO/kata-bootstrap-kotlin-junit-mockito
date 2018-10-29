package area

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.junit.jupiter.MockitoExtension
import kotlin.math.PI

@ExtendWith(MockitoExtension::class)
internal class CircleAreaCalculatorTest {

    @Test
    fun `should calculate an area of PI x 2^2`() {
        // given
        val radius = 2
        val calculator = CircleAreaCalculator()

        // when
        val area = calculator.calculateCircleArea(radius.toDouble())

        // then
        assertThat(area).isEqualTo(PI * radius * radius)
    }
}