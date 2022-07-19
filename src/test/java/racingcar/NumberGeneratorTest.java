package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberGeneratorTest {

    @Test
    void generateNumber() {
        int number = NumberGenerator.generateRandomNumber();
        assertThat(ValidationUtil.checkValidation(number)).isTrue();
    }
}
