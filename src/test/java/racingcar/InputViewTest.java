package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.assertj.core.api.Assertions.assertThat;

public class InputViewTest {
    BufferedReader bufferedReader;

    @BeforeEach
    void setUp() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    }

    @DisplayName("input 요소 정확히 입력받았는지 확인")
    @CsvSource(value = {"0:coding", "1:mate", "2:moon"}, delimiter = ':')
    @ParameterizedTest
    void inputCarNames(int index, String name) {
        System.out.println(index + " : " + name);
        String[] names = InputView.inputCarNames("coding,mate,moon");
        assertThat(names[index]).isEqualTo(name);
    }
}
