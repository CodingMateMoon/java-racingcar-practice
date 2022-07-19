package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    void racing() {
        Car car = new Car("pobi", 0);
        car.racing(4);
        assertThat(car.getPosition()).isEqualTo(1);
    }
}
