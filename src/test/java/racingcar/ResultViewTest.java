package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ResultViewTest {

    @Test
    void printCarStatus() {
        Car car = new Car("jang", 2);

        assertThat(car.printCarStatus()).isEqualTo("jang : --");
    }
}
