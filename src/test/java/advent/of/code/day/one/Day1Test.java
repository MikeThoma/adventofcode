package advent.of.code.day.one;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class Day1Test {

    @Mock
    private ResourceFileReader resourceFileReader;

    @InjectMocks
    private Day1 day1;

    @Test
    @SneakyThrows
    void shouldReturn0_whenOnlyOneMeasurementExists() {
        when(resourceFileReader.read(any())).thenReturn("10");

        int expected = day1.run();

        assertThat(expected).isZero();
    }

    @Test
    @SneakyThrows
    void shouldReturn1_whenOneDepthIncreasementExists() {
        when(resourceFileReader.read(any())).thenReturn("9\n10");

        int expected = day1.run();

        assertThat(expected).isEqualTo(1);
    }

    @Test
    @SneakyThrows
    void shouldReturn2_whenTwoDepthIncreasementExists_onlyIncreases() {
        when(resourceFileReader.read(any())).thenReturn("9\n10\n11");

        int expected = day1.run();

        assertThat(expected).isEqualTo(2);
    }

    @Test
    @SneakyThrows
    void shouldReturn2_whenTwoDepthIncreasementExists_upAndDown() {
        when(resourceFileReader.read(any())).thenReturn("9\n8\n11\n4\n10");

        int expected = day1.run();

        assertThat(expected).isEqualTo(2);
    }

    @Test
    @SneakyThrows
    void shouldReturn7_whenTestcaseOfWebsiteIsUsed() {
        when(resourceFileReader.read(any())).thenReturn("199\n200\n208\n210\n200\n207\n240\n269\n260\n263");

        int expected = day1.run();

        assertThat(expected).isEqualTo(7);
    }


}