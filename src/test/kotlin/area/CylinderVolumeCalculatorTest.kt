package area

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.BDDMockito.given
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.junit.jupiter.MockitoExtension
import kotlin.math.PI

@ExtendWith(MockitoExtension::class)
internal class CylinderVolumeCalculatorTest {
    @Mock
    private lateinit var multiplier: CircleAreaCalculator
    @InjectMocks
    private lateinit var underTest: CylinderVolumeCalculator

    @Test
    fun `should return a volume of 2PI when cylinder radius is 1 and height is 2`() {
        // given
        given(multiplier.calculateCircleArea(1.0)).willReturn(PI)

        // when
        val output = underTest.calculateCylinderVolume(
                radius = 1.0,
                height = 2.0
        )

        // then
        assertThat(output).isEqualTo(2 * PI)
    }
}