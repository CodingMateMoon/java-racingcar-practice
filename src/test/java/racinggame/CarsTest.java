package racinggame;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    // 테스트하기 좋은 생성자 추가. public Car(final String name) -> public Car(final String name, int position)
    @Test
    void findWinners() {
        Car pobi = new Car("pobi", 2);
        Car moon = new Car("moon", 2);
        Car jang = new Car("jang", 0);
        List<Car> original = Arrays.asList(pobi, moon, jang);
        Cars cars = new Cars(original);
        assertThat(cars.findWinners()).containsExactly(pobi, moon);
    }
}
