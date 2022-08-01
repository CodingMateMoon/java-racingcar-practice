package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsBeforeTest {

    private CarsBefore cars;

    @BeforeEach
    void setUp() {
        cars = new CarsBefore(Arrays.asList(new CarBefore("pobi", 0), new CarBefore("crong", 0), new CarBefore("honux", 0)));
    }

    @Test
    void racingCars() {

        PlayResult playResult = cars.racingCars(5);

    }

    @Test
    void findWinners() {
        List<CarBefore> winners = cars.findWinners();
        CarBefore winner = winners.get(0);
        List<CarBefore> carList = cars.getCarList();
        for (CarBefore car : carList) {
            if (!car.getName().equals(winner.getName())) {
                assertThat(winner.getPosition()).isGreaterThanOrEqualTo(car.getPosition());
            }
        }

    }

    @Test
    void findOne() {
        Optional<CarBefore> result = cars.findOne("pobi");
        CarBefore car = result.get();
        assertThat(car.getName()).isEqualTo("pobi");
    }

    @Test
    void printResult() {
    }
}
