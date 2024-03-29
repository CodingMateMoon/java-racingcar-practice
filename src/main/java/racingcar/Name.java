package racingcar;

import org.apache.commons.lang3.StringUtils;

public class Name {
    private String name;

    public Name(String name) {
        if(StringUtils.isBlank(name)){
            throw new IllegalArgumentException("자동차 이름은 값이 존재해야 합니다.");
        }

        if(name.length() > 5){
            throw new IllegalArgumentException("자동차 이름은 5이하만 가능합니다.");
        }
        this.name = name;
    }
}
