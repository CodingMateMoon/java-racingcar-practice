package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationUtilTest {

    @Test
    void checkValidation() {
        boolean result = ValidationUtil.checkValidation(9);
        assertThat(result).isTrue();
    }
}
