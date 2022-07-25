package racinggame;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    void 이동() {
        Car car = new Car("pobi"){
            @Override
            protected int getRandomNo() {
                return 4;
            }
        };
        car.move();
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    void 정지() {
        Car car = new Car("pobi");
        car.move();
        assertThat(car.getPosition()).isEqualTo(0);
    }
}
