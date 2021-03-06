package racinggame;


import org.apache.commons.lang3.StringUtils;
import racingcar.MovingStrategy;

import java.util.Random;

public class Car {

    private static final int FORWARD_NUM = 4;
    private static final int MAX_BOUND = 10;
    private final String name;
    private int position = 0;

    public Car(final String name) {
        if(StringUtils.isBlank(name)){
            throw new IllegalArgumentException("자동차 이름은 값이 존재해야 합니다.");
        }
        this.name = name.trim();
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public void move(MovingStrategy movingStrategy) {
        if(movingStrategy.movable())
            this.position++;
    }

    // 처음부터 변경 가능성을 예측하며 과도한 설계를 하기보다 서비스를 유지보수하면서 자주 변경이 일어나는 경우 따로 인터페이스로 추출하는 것도 한 가지 방법
    public void move(int randomNo) {
        if(randomNo >= FORWARD_NUM)
            this.position++;
    }

    public void move() {
        if(getRandomNo() >= FORWARD_NUM)
            this.position++;
    }

    // 메소드 시그니쳐를 안바꾸고 private->protected로 변경해서 테스트 가능한 구조로 변경합니다. 테스트 코드상에서 protected로 선언된 getRandomNo를 오버라이드하고 상수값을 리턴하도록 할 수 있습니다.
    protected int getRandomNo() {
        Random random = new Random();
        return random.nextInt(MAX_BOUND);
    }
}
