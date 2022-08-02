package racinggame;


import racingcar.MovingStrategy;
import racingcar.Name;

import java.util.Random;

public class Car {

    private static final int FORWARD_NUM = 4;
    private static final int MAX_BOUND = 10;
    private final Name name;
//    private int position = 0;
    private Position position;

    public boolean positionBiggerThan(Position maxPosition) {
        return this.position.isBiggerThan(maxPosition);
    }

    public Position getPosition() {
        return this.position;
    }

    public boolean positionEqualTo(Position maxPosition) {
        return this.position.equals(maxPosition);
    }

    public Car(final String name) {

        this(name, 0);
    }

    public Car(final String name, int position) {

        this.name = new Name(name);
        this.position = new Position(position);
    }

//    public int getPosition() {
//        return position;
//    }

    public Name  getName() {
        return name;
    }

    public void move(MovingStrategy movingStrategy) {
        if(movingStrategy.movable())
            this.position.move();
    }

    // 처음부터 변경 가능성을 예측하며 과도한 설계를 하기보다 서비스를 유지보수하면서 자주 변경이 일어나는 경우 따로 인터페이스로 추출하는 것도 한 가지 방법
    public void move(int randomNo) {
        if(randomNo >= FORWARD_NUM) {
            this.position.move();
        }
    }

    public void move() {
        if(getRandomNo() >= FORWARD_NUM)
            this.position.move();
    }

    // 메소드 시그니쳐를 안바꾸고 private->protected로 변경해서 테스트 가능한 구조로 변경합니다. 테스트 코드상에서 protected로 선언된 getRandomNo를 오버라이드하고 상수값을 리턴하도록 할 수 있습니다.
    protected int getRandomNo() {
        Random random = new Random();
        return random.nextInt(MAX_BOUND);
    }


}
