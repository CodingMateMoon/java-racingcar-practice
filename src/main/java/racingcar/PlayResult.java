package racingcar;

import java.util.List;

public class PlayResult {
    private final List<CarBefore> winners;

    public PlayResult(List<CarBefore> winners) {
        this.winners = winners;
    }

    public String[] getWinners() {
        return new String[0];
    }
}
