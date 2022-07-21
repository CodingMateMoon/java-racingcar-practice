package racingcar;

import java.util.List;
import java.util.Optional;

public class Cars {
    private final List<Car> carList;

    public Cars(List<Car> cars) {
        this.carList = cars;
    }

    public List<Car> getCarList() {
        return carList;
    }

    /*

     */
    public PlayResult racingCars(int playCount) {

        for (int i = 0; i < playCount; i++) {

            racingOne();
        }



        return new PlayResult(carList);
    }

    private void racingOne() {
        for (Car car : carList) {
            car.racing(NumberGenerator.generateRandomNumber());
        }
    }

    public List<Car> findWinners() {
        int max = 0;
        for (Car car : carList) {
        }
        return null;
    }

    public Optional<Car> findOne(String input) {
        Car result = null;
        for (Car car : carList) {

            if(car.getName().equals(input))
                result  = car;
        }
        return Optional.ofNullable(result);
    }
}
