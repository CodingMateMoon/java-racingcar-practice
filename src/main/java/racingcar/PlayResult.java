package racingcar;

import java.util.List;

public class PlayResult {
    private final List<Car> winners;

    public PlayResult(List<Car> winners) {
        this.winners = winners;
    }

    public String[] getWinners() {
        return new String[0];
    }
}
