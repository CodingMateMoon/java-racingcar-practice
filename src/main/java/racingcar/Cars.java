package racingcar;

import java.util.List;

public class Cars {
    private final List<Car> carList;

    public Cars(List<Car> cars) {
        this.carList = cars;
    }

    public PlayResult racingCars() {
        return new PlayResult();
    }
}
