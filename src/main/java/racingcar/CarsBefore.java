package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CarsBefore {
    private final List<CarBefore> carList;

    public CarsBefore(List<CarBefore> cars) {
        this.carList = cars;
    }

    public List<CarBefore> getCarList() {
        return carList;
    }

    /*

     */
    public PlayResult racingCars(int playCount) {

        for (int i = 0; i < playCount; i++) {

            racingOne();
        }

        PlayResult playResult = new PlayResult(findWinners());
        return playResult;
    }

    public void racingOne() {
        for (CarBefore car : carList) {
            car.racing(NumberGenerator.generateRandomNumber());
        }
    }

    public List<CarBefore> findWinners() {
        /*
        Car들을 서로 비교해서 position이 같거나 더 큰 경우 해당 position 및 name 값을 저장합니다.
        ArrayList에서 값이 같은 경우 추가하고 더 큰 값이 나온 경우 다 비운후 해당값을 넣습니다.
         */
        List<CarBefore> winners = new ArrayList<>();

        for (CarBefore car : carList) {
            if(winners.size() == 0) {
                winners.add(car);
                continue;
            }
            findWinner(winners, car);

        }
        return winners;
    }

    private void findWinner(List<CarBefore> winners, CarBefore car) {
        for (CarBefore winner : winners) {
            if (winner.getPosition() < car.getPosition()) {
                winners.clear();
                winners.add(car);
                break;
            } else if (winner.getPosition() == car.getPosition()) {
                winners.add(car);
                break;
            }
        }
    }

    public Optional<CarBefore> findOne(String input) {
        CarBefore result = null;
        for (CarBefore car : carList) {

            if(car.getName().equals(input))
                result  = car;
        }
        return Optional.ofNullable(result);
    }
}
