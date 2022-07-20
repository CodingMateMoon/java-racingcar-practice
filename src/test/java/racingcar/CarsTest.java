package racingcar;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarsTest {

    @Test
    void carsRacing() {

        Cars cars = new Cars(Arrays.asList(new Car("pobi", 0), new Car("crong", 0), new Car("honux", 0)));
        PlayResult playResult = cars.racingCars();
        String[] result = playResult.getWinners();

    }
}
