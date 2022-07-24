package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    private Cars cars;

    @BeforeEach
    void setUp() {
        cars = new Cars(Arrays.asList(new Car("pobi", 0), new Car("crong", 0), new Car("honux", 0)));
    }

    @Test
    void racingCars() {

        PlayResult playResult = cars.racingCars(5);

    }

    @Test
    void findWinners() {
        List<Car> winners = cars.findWinners();
        Car winner = winners.get(0);
        List<Car> carList = cars.getCarList();
        for (Car car : carList) {
            if (!car.getName().equals(winner.getName())) {
                assertThat(winner.getPosition()).isGreaterThanOrEqualTo(car.getPosition());
            }
        }

    }

    @Test
    void findOne() {
        Optional<Car> result = cars.findOne("pobi");
        Car car = result.get();
        assertThat(car.getName()).isEqualTo("pobi");
    }

    @Test
    void printResult() {
    }
}
