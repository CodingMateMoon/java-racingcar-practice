package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarBeforeTest {

    @Test
    void racing() {
        CarBefore car = new CarBefore("pobi", 0);
        car.racing(4);
        assertThat(car.getPosition()).isEqualTo(1);
    }


}
