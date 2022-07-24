package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ResultViewTest {

    @Test
    void printCarStatus() {
        CarBefore car = new CarBefore("jang", 2);

        assertThat(car.printCarStatus()).isEqualTo("jang : --");
    }
}
