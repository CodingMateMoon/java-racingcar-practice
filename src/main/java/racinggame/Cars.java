package racinggame;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }



    public List<Car> findWinners() {
        return findWinners(getMaxPosition());
    }

    private List<Car> findWinners(Position maxPosition) {
        List<Car> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.positionEqualTo(maxPosition)) {
                winners.add(car);
            }
        }
        return winners;
    }

    private Position getMaxPosition() {
        Position maxPosition = new Position();

        for (Car car : cars) {
            if (car.positionBiggerThan(maxPosition)) {
                maxPosition = car.getPosition();
            }
        }
        return maxPosition;
    }
}
