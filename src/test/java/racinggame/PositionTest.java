package racinggame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PositionTest {

    @Test
    void create() {
        Position position = new Position(3);
        assertThat(position.getPosition()).isEqualTo(3);
    }
}
